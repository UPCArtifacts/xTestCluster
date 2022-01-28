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
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI", 183, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                hi#!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("  hI!hihI!!hI!      hI!hihI!  hI!hihI!!hI!      hI!hihI!!hI!      hI!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a###      ", "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a###      " + "'", str2, "a###      ");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                             I#                                             ", 10, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   I#                                             " + "'", str3, "                                   I#                                             ");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!", (int) (short) 1, 340);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("####          !IHhi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI " + "'", str2, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI ");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#", "  hi!      hi  hi!      hi!      h", 10);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!!IH!IH!i#!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str10, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                             I#                                                                                                                                                                                                                                                                                                     ", "h  h  h  h  h  h  h  h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             I#                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                             I#                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIH", "Hi  Hi      Hi      Hi                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIH" + "'", str2, "!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIH");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!      HI  HI!      HI!      HI                       !I!", "IHI!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                           hi!    hI  hI...HI#!HI#!                                                                          ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "...   ...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI#!!IH!IH!", 96, "hi!Hi!!IH!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IHHI#!!IH!IH!hi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!" + "'", str3, "hi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IHHI#!!IH!IH!hi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa!      hi" + "'", str2, "aaaaaaa!      hi");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "  hi!  ..", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("#        I##  hi!      hi  hi!      hi!", "####!ih####!ih####!ih####!ih####!####!ih", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                          hi!hihi!hi!hhi!hihi!hi!hH", "hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih", "hi!I#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    !i", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "     hi ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                             IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH...Ih  IH                                                                                                                             ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "     hi      hi      hi      hi !i" + "'", str5, "     hi      hi      hi      hi !i");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI#", '4', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!      HI  HI!      HI!      HI                       !I!", "a###                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", 44, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str3, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI#       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#       " + "'", str1, "HI#       ");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!  ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  ..." + "'", str2, "hi!  ...");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    !ih", '#', 340);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  hi!      hi  hi!      hi!      h", "a###                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str2, "  hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "          hI  hI...HI#!HI#!HI#!HI#!HI#!...          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", "!!IH!IH!                 #                hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(" Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str1, " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI !I", "HI!I#", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#        I##  hi!      hi  hi!      hi!     ", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    !ih", "  hi!    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    !ih" + "'", str3, "    !ih");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 hi!      hi  hi!      hi!      h", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!I!  ...", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                                  !iH                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("AAAAAAAAA HI  HI      HI      HIAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4###4...H#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!" + "'", str3, "...4###4...H#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!iH#!");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", "I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("HI!HIHI!HI!HIHI!HIHI!HI!hi!hihi!hi!hHIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...     HI!     ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!IH                                                                                            ", "a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("iiiiiiiiiiiiiiii", "I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("  hi!      hi  hi!      hi!", "      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!HI!HI!!#ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!!#ih" + "'", str1, "!hi!hi!!#ih");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#        I##  hi!      hi  hi!      hi!     ", "       Hi!       444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#        I##  hi!      hi  hi!      hi!     " + "'", str2, "#        I##  hi!      hi  hi!      hi!     ");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("hi!          ####");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!          ####" + "'", str1, "hi!          ####");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                hi#!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("   hi!    ", "aaaaaaaaaaaaaaaaaaaaaa", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       Hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str1, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444          ", "  HI!      HI  HI!      HI!      H");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", 16, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!" + "'", str3, "hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi", 10, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaahiaahi!aaaaaahi!aaa" + "'", str3, "aaaaaahiaahi!aaaaaahi!aaa");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                iH                                                                                                                                                                            ", 40, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                iH                                                                                                                                                                            " + "'", str3, "                                                                                                                                                                                iH                                                                                                                                                                            ");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        hI!44", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!#iH", "hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaa", 262);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa" + "'", str2, "aaaaa");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!h", "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!" + "'", str1, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                  !iH                                               ", "aaaaaaaaaa                                                                                      !!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  HI4...", " #  ", "!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI4..." + "'", str3, "  HI4...");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!i#", "                             HI#                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i" + "'", str2, "hi!i");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hihi!hi!", " #  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!" + "'", str2, "hi!hihi!hi!");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444          ", "hI!44h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("a##", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !I", "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI#", "####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 352, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "hI#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" HI  HI  HI  HI  HI  HI  HI  HI  HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI  HI  HI  HI  HI  HI  HI  HI  HI" + "'", str1, "HI  HI  HI  HI  HI  HI  HI  HI  HI");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih", "                                                    ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI# HI  HI...HI" + "'", str1, "!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI# HI  HI...HI");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("AAAA", "aaaaaaa!      hi", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA" + "'", str3, "AAAA");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH", "4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!i...", (int) ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!i...                        " + "'", str3, "!ih!i...                        ");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "!ih", "", "" };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", strArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!    ", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str13, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 352 + "'", int14 == 352);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!      hi  hi!      hi!hi!  hi!      hi  hi!####          !IHhi!      hi  hi!      hi!hi!  hi!      hi  hi! ", "44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H", "H", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(" hi  hi!      hi!      hi", '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i      ", "", 173);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i" + "'", str1, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                   ", "I#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                   i#                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       H...", 40, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  Hi       Hi       H..." + "'", str3, "  Hi       Hi       H...");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih  !ih ", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih  !ih " + "'", str3, "ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih  !ih ");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!!!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!" + "'", str1, "!!!");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  Hi       Hi       Hi       Hi       Hi       Hi       H..." + "'", str1, "hi!  Hi       Hi       Hi       Hi       Hi       Hi       H...");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      ", "hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      " + "'", str2, "hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaa  HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hI#hI#hI#hI#hI#hI#hI#hI#", "!HI!HI!!#ih", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI#hI#hI#hI#hI#hI#hI#hI#!HI!HI!!#ihhI#hI#hI#hI#hI#hI#hI#hI#" + "'", str3, "hI#hI#hI#hI#hI#hI#hI#hI#!HI!HI!!#ihhI#hI#hI#hI#hI#hI#hI#hI#");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi! hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi! hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str3, "hi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi! hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi#!", "###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Hi!i!       aaHi!i!       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!" + "'", str3, "hi#!");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi" + "'", str2, "aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                        HI#                         ", 94, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHhi#!!IH!IH!Hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        HI#                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                        HI#                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" hi!", (int) (short) -1, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", 277, 183);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi  hi!      hi!" + "'", str3, " hi  hi!      hi!");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!IH", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', (int) (byte) 10, 0);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("                                                                                      !!!hhIHhIHh", "                HI#!!IH!IH!                 ", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", strArray6, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                   hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str2, "                                                                                                                                                   hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                             HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI                                                                                                                             ", "hi#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "                                             I#                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i!hihi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih!ih!ihih!ih", "hI#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118 + "'", int2 == 118);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("IH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  " + "'", str1, "iH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  ");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("      hi #!      ", "aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!", "4444444444444444444444444", "   hi !i                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!" + "'", str3, "Hi!");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str1, "hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("hi!      hi  hi!      hi!      hi", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("!IH                                                                                            ", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("aaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!  ...", 76, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  ..." + "'", str3, "hi!  ...");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih      !ih      !ih  ih      !ih  ", "HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi#", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!!!hhIHhIHh", " #  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "                     hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!      hi  hi!      hi!      hi", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!      hi  hi!      hi!      hi" + "'", str3, "hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  Hi       Hi       H...", "  hi!  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI! ####          !IH", "                                                                                      !!!hhihhihh", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                             HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI                                                                                                                             ", "                 ..                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                             HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI                                                                                                                             " + "'", str2, "                                                                                                                             HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI                                                                                                                             ");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...HI ...", (int) (short) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI ..." + "'", str3, "...HI ...");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi", "I!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hihi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH  !ih ", "####################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                     #######hi#");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  hi!  ...", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!  ..." + "'", str2, "  hi!  ...");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                          ", 113);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                       " + "'", str2, "                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                       ");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("####          !ih", "hI!44h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####          !ih" + "'", str2, "####          !ih");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", "               iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   hi  hi!      hi!      ", '#', 230);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih", "HI!      HI  HI!      HI!      HI                       !I!", 173, 40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ihHI!      HI  HI!      HI!      HI                       !I!" + "'", str4, "!ihHI!      HI  HI!      HI!      HI                       !I!");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("hi!      hi  hi!      hi!      hi", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi !i", "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih", "i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" H  ", "hi!hihi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " H  " + "'", str2, " H  ");
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("hi!Hi!!IH!I", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                     #######hi#", "                                                                                                I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     #######hi#" + "'", str2, "                                                                                     #######hi#");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("          ", "hi !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", ' ', 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("####################################################", "HI!I!  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i" + "'", str1, "hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih!i...                        ", "                        hi#                         ", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!i...                        " + "'", str3, "!ih!i...                        ");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!    ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi#", "#        I##  hi!      hi  hi!      hi!     ", (int) '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("##.##HI!######HI##HI!######HI!######H#################################################################################################################################################################################################################################", "   hi  hi!      hi!      ", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!I#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!I#" + "'", str1, "HI!I#");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...   hi !i                           ...", "hi!      hi  hi!      hi!      h", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaa                                                                                      !!!hhIHhIHh", "                                   ", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaa!!!hhIHhIHh" + "'", str4, "aaaaaaaaaa!!!hhIHhIHh");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str1, "hI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!hi!hihihi!hi!hi!hihi!..." + "'", str1, "hihi!hi!hihihi!hi!hi!hihi!...");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", "Hi!i!       aaHi!i!       ", 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" hi!", "hi!      hi  hi!      hi!      ", (int) (short) 10);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("... ", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("...   ...! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("   ", ".");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#", 8, "hi!  HI!   ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#" + "'", str3, "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH", "i!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!" + "'", str1, "i!");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ih      !ih      !ih  ih      !ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih" + "'", str2, "ih      !ih      !ih  ih      !ih");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                           hi!    hI  hI...HI#!HI#!                                                                          ", "hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", "hi!hihi!hi!hhi!hihi!hi!hH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                           hi!    hI  hI...HI#!HI#!                                                                          " + "'", str3, "                                                                           hi!    hI  hI...HI#!HI#!                                                                          ");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!#Ih", "       Hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#Ih" + "'", str2, "!#Ih");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" h            h        h       ", "...hih...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAA ", "!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###      !!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!", "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAA " + "'", str3, "AAAAAAAAA ");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hihihihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "hihihihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", 8, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ..." + "'", str3, "...      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ...");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", '4', 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!..." + "'", str1, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!...");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!i#", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "hI#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH", "IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  ", "H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH" + "'", str3, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444" + "'", str1, "4444444444");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                 HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                     ", "HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#################################", "aaaaaaaaa ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################" + "'", str2, "#################################");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#", "                       !i!", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("        HI! ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H " + "'", str2, " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H ");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  #hi#!#     ..." + "'", str2, "  #hi#!#     ...");
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      hi!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("hi#################################################################################################", charArray6);
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
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                                                          ...#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#        I##  hi!      hi  hi!      hi!    ", 230, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI", "ih      !ih      !ih  ih      !i", 26);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hI#hI#hI#hI#hI#hI#hI#hI#", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("H", "HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" hi", "hi#!!IH!IH!hi#!!IH!IH!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi" + "'", str2, " hi");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", "hI#hI#hI#hI#hI#hI#hI#hI#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  .  HI!      HI  HI!      HI!      H                                                                                                                                                                                                                                 ", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  .  HI!      HI  HI!      HI!      H                                                                                                                                                                                                                                 " + "'", str2, "  .  HI!      HI  HI!      HI!      H                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaa ", " ..", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa " + "'", str3, "aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa ");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ", "      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!IH", "       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 319 + "'", int2 == 319);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                           hi!    hI  hI...HI#!HI#!                                                                          ", "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAA HI  HI      HI      HIAAAAAAAA", "hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", 82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " H  ", (int) (short) 100, 119);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!", "Hi#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi", 'a', 352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       HI!                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####          !ih####      !!!hhihh", 99, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      hi!      hi  hi!      hi!      h HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!    ####          !ih####      !!!hhihh" + "'", str3, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!    ####          !ih####      !!!hhihh");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("        hI!44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("     hi      hi      hi      hi !i", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     hi      hi      hi      hi !i" + "'", str2, "     hi      hi      hi      hi !i");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "hi#                     hi#                     hi#                     hi#                     h", "#        I##  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str3, "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!#", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi#");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                     #######hi#", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaa", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa                                   " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaa                                   ");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".", "hi!#");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!!", strArray5, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!!!" + "'", str7, "!!!");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", charArray6);
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
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "ih!ih!ihih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", ' ');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("#        i##  HI!      HI  HI!      HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!!!", "                        hi#                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..", 230);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaa", "hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" HI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " !i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 882, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                 " + "'", str3, "                                                                                                                                                                                                                                                                Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                               " + "'", str1, "                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                               ");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                HI4!!IH!IH!                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                HI4!!IH!IH!                 " + "'", str1, "                HI4!!IH!IH!                 ");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH", (-1), "aaaaaaaaaa                                                                                      !!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH" + "'", str3, "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                        hi#                         ", (int) (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        hi#                         " + "'", str3, "                        hi#                         ");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!" + "'", str1, "hi#!!IH!IH!");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "a###                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" hi!", "hi!      hi  hi!      hi!      ", (int) (short) 10);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!!!hi!!!!!", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!!IH!IH!                                 hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!ih!ih!                                 HI" + "'", str1, "!!ih!ih!                                 HI");
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI", "hi!      hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI", "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str2, "!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", "  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaa", "hi#####################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        int int1 = org.apache.commons.lang3.StringUtils.length("hi#!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("Hi!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("                    ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  Hi       Hi       H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi       Hi       H..." + "'", str1, "Hi       Hi       H...");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", 882);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("  Hi       Hi       H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    !iH", "!Ih", 882);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("Hi!", "!IH");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!ih                                ", strArray4, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi!hIhI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", 10, 113);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!ih                                " + "'", str10, "!ih                                ");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Hi...", "ih      !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi..." + "'", str2, "Hi...");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        " + "'", str2, "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ");
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...   ...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI! ####          !IH", "hI!44h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                     #######hi#", "                                                  !iH                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "####################################################################################################################Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I#", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi", "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi" + "'", str2, "aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         ", "HI#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("       Hi!", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("#        I##  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH...Ih  Ih " + "'", str1, "IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH...Ih  Ih ");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("I!44", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!44" + "'", str2, "I!44");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. ", "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("i#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH  HI!IH", "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH", 0, 118);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "                        HI#                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str2, " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi#", " H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#" + "'", str2, "hi#");
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ih      !ih      !ih  ih      !ih  ", "####################################################################################################################Hi!", 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      h", "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", (int) '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("... ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                hi#!!IH!IH!                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                hi#!!ih!ih!                 " + "'", str1, "                hi#!!ih!ih!                 ");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!", "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!" + "'", str2, "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...hih...", "                                          hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h                                           ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!...", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...   hi !i                           ...", "#        I##", 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                           hi!    hI  hI...HI#!HI#!                                                                          ", "hi#!", "HI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !I", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                           hi!    hI  hI...HI#!HI#!                                                                          " + "'", str4, "                                                                           hi!    hI  hI...HI#!HI#!                                                                          ");
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("            HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH", " ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            !hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhh" + "'", str3, "            !hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhh");
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444          ", "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#", "hi#                     hi#                     hi#                     hi#                     h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih ", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("i!    ", "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#        I##  hi!      hi  hi!      hi!    ", "                                 h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", 116);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("  hi!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                       !i!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################" + "'", str3, "#################################################################################################");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(" hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI" + "'", str1, "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!!IH!IH!                 #                hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!ih!ih!                 #                hi" + "'", str1, "!!ih!ih!                 #                hi");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#", "                         hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("iH", "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hI#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!#", "hi#!!IH!IH!hi#!!IH!IH!HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h", "aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi", "hi!i!       aaHi!i!       ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h" + "'", str4, "                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih!i...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!i..." + "'", str1, "!ih!i...");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                   hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                  ", 76, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                   hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                  " + "'", str3, "                                                                                   hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                  ");
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444", "    !iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "hi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi! hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "hi!HI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HiHiHiHiHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i" + "'", str2, "      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" h            h        h        ", '#');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h" + "'", str3, "!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h");
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          !ih", "          ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444          ", strArray4, strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i", strArray7, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444444          " + "'", str8, "4444444444444444444444444          ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i" + "'", str12, "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " #  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  hI!hihI!!hI!      hI!hihI!  hI!hihI!!hI!      hI!hihI!!hI!      hI!h", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hI!hihI!!hI!      hI!hihI!  hI!hihI!!hI!      hI!hihI!!hI!      hI!h" + "'", str2, "  hI!hihI!!hI!      hI!hihI!  hI!hihI!!hI!      hI!hihI!!hI!      hI!h");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", " hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str1, "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("     !ih", "                hi#!!IH!IH!                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           hi#!!IH!IH!                 " + "'", str2, "           hi#!!IH!IH!                 ");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "    !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("HIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIa", " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi...", "a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  H" + "'", str1, "HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  H");
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !", "       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        int int1 = org.apache.commons.lang3.StringUtils.length("aaaaaahiaahi!aaaaaahi!aaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH" + "'", str1, "Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a##", 347, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!" + "'", str1, "!i!");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#" + "'", str2, "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!Ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi#################################################################################################", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#################################################################################################" + "'", str3, "hi#################################################################################################");
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444", (int) (short) 100, "hi!i#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#44444444444444444444444444444444444" + "'", str3, "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#44444444444444444444444444444444444");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("   hi  hi!      hi!      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                          hi!hihi!hi!hhi!hihi!hi!hH", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HI!44", "                         hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("####          !ih####      !!!hhihhihh####          !ih####      ", "hi!      hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####          !ih####      !!!hhihhihh####          !ih####      " + "'", str2, "####          !ih####      !!!hhihhihh####          !ih####      ");
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "hi!I#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Hi!!IH!IH!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  hi!      hi  hi!      hi!      h", strArray4, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "..." + "'", str10, "...");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str12, "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!  HI!   ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      hi!  HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I" + "'", str3, "!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I");
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                  ", 130, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                  " + "'", str3, "                                                                                                                                  ");
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAA", " hi!  Hi       Hi       Hi       Hi       Hi       Hi       H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA" + "'", str2, "AAAA");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("!!!HHIHHIHH", "I!44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi", " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#" + "'", str2, "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#");
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I" + "'", str1, "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("            !hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhh", "...hih...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("     hi ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                     #######hi#", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("###AAA", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###AAA" + "'", str2, "###AAA");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hI#hI#hI#hI#hI#hI#hI#hI#", "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("        I", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         I  " + "'", str2, "         I  ");
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!IH", "!iH", (int) (byte) 10);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!   ", strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                 HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                     ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                            !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                      !!!hhihhihh", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!hhihhihh" + "'", str2, "!!!hhihhihh");
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa ", "i!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      hi #!      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("  hi!      hi  hi!      hi!", "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", "HI!HIHI!HI!HIHI!HIHI!HI!hi!hihi!hi!hHIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih      !ih      !ih  ih      !ih  ", "!ih");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("  hi!      hi  hi!      hi!", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "hi#####################...      ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str8, "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...        hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...        " + "'", str10, "hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...        hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...        ");
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih " + "'", str3, "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH", 230);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!!hi#   !iH   hi#   hi!!hi#   !iH   hi#", "!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#" + "'", str2, "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#");
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!I", "####################################################                              ", 340, 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaa####################################################                              " + "'", str4, "aaaaaaaaaaa####################################################                              ");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  HI4...", "Hi  Hi      Hi      Hi");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...     HI!     ", 352);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("  hi!      hi  hi!      hi!      hi", "       Hi!       444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!", "                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!" + "'", str2, "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!");
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#        i##  HI!      HI  HI!      HI!    ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("i", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("4444444444444444444444444          ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!      HI  HI!      HI!      HI                       !I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HI!HI!I!" + "'", str1, "HI!HIHI!HI!HI!I!");
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#        I##  hi!      hi  hi!      hi!    ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!    ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!iH         i!iH             !i!iH             !i!iH         i!iH             !i!ih" + "'", str1, "!i!iH         i!iH             !i!iH             !i!iH         i!iH             !i!ih");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    ", "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H", "Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! " + "'", str2, " H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hihihihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "hihihihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "  #hi#!#     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI! ####          !IH", "aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ", "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                     hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", 882);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!i#");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str8, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##", 341, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi#####################.", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH", "hi#...   ...!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH" + "'", str2, "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI", "IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                     #######hi#", 118, "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###aaaaaaaa                                                                                     #######hi####aaaaaaaaa" + "'", str3, "###aaaaaaaa                                                                                     #######hi####aaaaaaaaa");
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "###");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!I#", "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!I#" + "'", str2, "HI!I#");
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#I##hi!hihi!hi!", "H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#I##hi!hihi!hi!" + "'", str3, "#I##hi!hihi!hi!");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444!ih!i...4444444444444444444444444444444444444444444444", "!IH!IH!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    !i", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaa!i" + "'", str4, "aaaa!i");
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", ' ', 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  " + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ");
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i" + "'", str1, "i");
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("hi!      hi  hi!      hi!      hi", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH  !ih ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi#hi!I#hi!I#hi!I#hi!I#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("################!!!hhihhihh#################", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 10, 2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "       hI!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#        i##  HI!      HI  HI!      HI!    ", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("a###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "                       !i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!  HI!   ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      hi", "aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" hi!  ", "!IH!IH!                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa", ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "  hi");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", "#        I##  HI!      HI  HI!      HI!     ", 183);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("...", strArray5, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!!hi#   !iH   hi#   hi!!hi#   !iH   hi#", "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ihHI!      HI  HI!      HI!      HI                       !I!", 'a', 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " Hi  Hi      Hi      Hihi!hihi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("       hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH", (int) 'a', "                hi#!!IH!IH!                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH                hi#!!IH!IH!      " + "'", str3, "Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH                hi#!!IH!IH!      ");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", 369, "444444444444444444444444444444444444444444444444!#ih444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444!#ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h444444444444444444444444444444444444444444444444!#ih444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444!#ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h444444444444444444444444444444444444444444444444!#ih444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!      h", 67, "                                                                           hi!    hI  hI...HI#!HI#!                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  hi!      hi  hi!      hi!      h                 " + "'", str3, "                  hi!      hi  hi!      hi!      h                 ");
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaa", "!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", "aaaaaaaaaa                                                                                      !!!hhIHhIHh", 369);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaa" + "'", str4, "aaaa");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("       hi#", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#" + "'", str2, "       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!!IH!IH!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   ", "hi!    ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi", strArray3, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!Hi!!IH!IH!" + "'", str7, "hi!Hi!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", "###aaaaaaaa                                                                                     #######hi####aaaaaaaaa", " Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str3, "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("  hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI" + "'", str1, "  HI");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", 339, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... !iH !i" + "'", str3, "... !iH !i");
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", " Hi!", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!i#");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("HI#", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       !i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("  ...", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("a", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 352);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("...!ih ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAA", "!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA" + "'", str2, "AAAA");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                          ...#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          ...######" + "'", str1, "                                                                                          ...######");
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!i!", "hi!    ", 183, 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!i!hi!    " + "'", str4, "!i!hi!    ");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("iH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                  " + "'", str1, "Ih                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                  ");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                         #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i                                                                                                                                         ", "!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###      !!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i                                                                                                                                         " + "'", str2, "ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i                                                                                                                                         ");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         I  ", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("###aaaah  h  h  h  h  h  h  h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "hi#####################...      ", 270);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "", "iiiiiiiiiiiiiiii");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("I!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!44" + "'", str1, "I!44");
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!      hi", (int) (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaahiaahi!aaaaaahi!aaa", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444          " + "'", str1, "4444444444444444444444444          ");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi#!", (-1));
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###", "                                   i#                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi", "4444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi");
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 hi!      hi  hi!      hi!      h", "!ih!i...                        ", 110);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I" + "'", str2, "I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  H", "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                  ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("h444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444  hi!      hihi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h444444444444444444444444444444444444444444444444hi!444444444444444444444444444444444444444444444444  hi!      hihi hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi" + "'", str2, "h444444444444444444444444444444444444444444444444hi!444444444444444444444444444444444444444444444444  hi!      hihi hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi");
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h", 35, "!i!hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h" + "'", str3, "!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!IH                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                            " + "'", str1, "!ih                                                                                            ");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                              HI#!                               ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...!ih ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!ih..." + "'", str2, "...!ih...");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("#############################################################################################################################################################################!IH##############################################################################################################################################################################", "  HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}
