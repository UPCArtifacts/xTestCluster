import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("!IH                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     hi ", '4', 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("!!!hhIHhIHh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!hhIHhIHh" + "'", str1, "!!!hhIHhIHh");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi!#", "hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 8, "!!!HHIHHIHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi" + "'", str2, "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...   ...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   ..." + "'", str2, "...   ...");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!Hi!!IH!I", "Hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!   ", "aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi!I#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "hi!Hi!!IH!I", "####          !ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                hi#!!IH!IH!                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("  Hi     ", "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH" + "'", str2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi#", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#" + "'", str2, "hi#");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("iiiiiiiiiiiiiiii", "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#######hi#", 6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######hi#" + "'", str3, "#######hi#");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi#", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi#" + "'", str3, "Hi#");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str1, "I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    !i", 'a', 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("       Hi!", " h            h        h        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!" + "'", str2, "       Hi!");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "HI#!", "                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#######hi#", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     #######hi#" + "'", str2, "                                                                                     #######hi#");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  hi!      hi  hi!      hi!", "####          !ih####          !ih####          !ih####          !ih####          !####          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!!IH!IH!" + "'", str1, "HI#!!IH!IH!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("h#", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("  hi", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi" + "'", str2, "  hi");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!!!                                                                                                 ", "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!                                                                                                 " + "'", str2, "!!!                                                                                                 ");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI#", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!   ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  Hi     ", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!!!hhIHhIHh", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" Hi!", "", 8, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " Hi!" + "'", str4, " Hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", "                                                                                                                                                                            Hi                                                                                                                                                                                ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" hi  hi!      hi!      hi", "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi" + "'", str2, " hi  hi!      hi!      hi");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!!!HHIHHIHH", "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!HHIHHIHH" + "'", str2, "!!!HHIHHIHH");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("       HI!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!" + "'", str2, "       HI!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "       HI!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH" + "'", str2, "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("  HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!HI!HI!!#ih", (int) (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HI!!#ih" + "'", str3, "!HI!HI!!#ih");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                  ", 8, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!", "    !iH", (int) (byte) 0);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaa", " Hi  Hi      Hi      Hi", 9, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa" + "'", str4, "aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi!      hi  hi!      hi!      hi", (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!  ..." + "'", str3, "  hi!  ...");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I", " ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih" + "'", str1, "!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!!!hhihhihh", 65, "####          !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####          !ih####      !!!hhihhihh####          !ih####      " + "'", str3, "####          !ih####      !!!hhihhihh####          !ih####      ");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HI#       ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "       hi#", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("       HI!                                                                                       ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!IH                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  hi!    ", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", 99, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str4, "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        HI#                         " + "'", str1, "                        HI#                         ");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          " + "'", str1, "          ");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "                                                                                      !!!hhihhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("          ", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Ih" + "'", str1, "!Ih");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!44" + "'", str3, "hI!44");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!!!hhIHhIHh", "!!!hhihhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!i#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" ..", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ..                " + "'", str2, "                 ..                ");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!" + "'", str1, "hi#!");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str2, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                HI#!!IH!IH!                 ", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                HI#!!IH!IH!                 " + "'", str2, "                HI#!!IH!IH!                 ");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", 26, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str3, "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("!iH", strArray4, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!iH" + "'", str9, "!iH");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("       hi#", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!!!hhihhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                     #######hi#", (int) (short) -1, "                                                                                     #######hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                     #######hi#" + "'", str3, "                                                                                     #######hi#");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  HI", (int) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("       HI!                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 352, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("   hi!    ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!    " + "'", str2, "!    ");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!      hi  hi!      hi!      h", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      h" + "'", str2, "hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  HI!    ", "hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!!!hhihhihh", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!hhihhihh" + "'", str3, "!!!hhihhihh");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#############################################################################################################################################################################!IH##############################################################################################################################################################################", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "####");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!    ", "       Hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!    " + "'", str3, "!    ");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("   ", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Hi#!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" ", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!!!hhihhihh", "   ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa", "!ih                                                                                                 ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("    !i", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   ..." + "'", str1, "...   ...");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!IH", (int) (short) 100, "ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !" + "'", str3, "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!hihi!hi!hi", "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", 350, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!HI!HI!!#ih", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HI!!#ih" + "'", str3, "!HI!HI!!#ih");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("        I#", 12, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#        I##" + "'", str3, "#        I##");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" ...", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  Hi     ", "                       !i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                      !!!hhIHhIHh", 95, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaa                                                                                      !!!hhIHhIHh" + "'", str4, "aaaaaaaaaa                                                                                      !!!hhIHhIHh");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("#        I##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!    ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  hi!    " + "'", str5, "  hi!    ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      h" + "'", str1, "hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "hi!#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  " + "'", str2, "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" !i!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !i!" + "'", str2, " !i!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!!IH!IH!", "i#");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "ih      !ih      !ih  ih      !ih  ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi#", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str8, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("  hi!   ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!   " + "'", str1, "  hi!   ");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  hi", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "                 ..                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I", "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I!      hi  hi!      hi!      hi", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!      hi  hi!      hi!      hi" + "'", str2, "I!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("          ", "  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "  hi!  ...", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ih      !ih      !ih  ih      !ih", "hi!i#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("####          !IH", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...", " ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  HI!    ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       hi#", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#" + "'", str2, "       hi#");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", "#############################################################################################################################################################################!IH##############################################################################################################################################################################", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                            Hi                                                                                                                                                                                ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("h", "hi!      hi  hi!      hi!", "####          !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("     hi ", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "     hi " + "'", str7, "     hi ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     " + "'", str1, "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  HI!    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!    " + "'", str2, "  HI!    ");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!      hi", "aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###", 369, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!!!hhihhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!hhihhihh" + "'", str1, "!!!hhihhihh");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "                hi#!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !" + "'", str1, "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "       HI!                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                I", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                I" + "'", str2, "                                                                                                I");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str2, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("I#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih      !", "!iH", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("    !i", "!HI!HI!!#ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !i" + "'", str2, "    !i");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "H", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Hi!!IH!IH!i#!", "hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!i#!" + "'", str3, "Hi!!IH!IH!i#!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!!IH!IH!", "i#");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) 0, (int) (byte) 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444444444444444444444          ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("... ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi#", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#" + "'", str2, "Hi#");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                    ", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "        I#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                     #######hi#", "  hi!    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "################!!!hhihhihh#################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I...", "hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I..." + "'", str2, "I...");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          !ih", (int) (short) 100, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          !ih" + "'", str3, "          !ih");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!    ", "I#", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str1, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "                        hi#                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####          !ih", "####          !ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       Hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!" + "'", str2, "       Hi!");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH" + "'", str2, "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("################!!!hhihhihh#################", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi!      hi  hi!      hi!      h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 12 vs 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "  hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaa", "          !ih", "hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str2, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int int1 = org.apache.commons.lang3.StringUtils.length("hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str1, "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", "       Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("ahi!", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (byte) -1, 369);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("  hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!#iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!#iH" + "'", str1, "!#iH");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH", 25, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH" + "'", str3, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a###                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi#", "          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaa                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                                                                                      !!!hhIHhIHh" + "'", str1, "aaaaaaaaaa                                                                                      !!!hhIHhIHh");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH                                                                                            ", "                                                                                      !!!hhihhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents(".");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" ", "  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 369, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", " HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str2, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!#iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!#Ih" + "'", str1, "!#Ih");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str3, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!hi!!!!!" + "'", str1, "!!!hi!!!!!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str1, "hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                  ", "i#", (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   i#                              " + "'", str4, "                                   i#                              ");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                     #######hi#", "HI#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     #######hi#" + "'", str2, "                                                                                     #######hi#");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("I#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#" + "'", str1, "I#");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa" + "'", str2, "aa");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!Ih", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Ih" + "'", str2, "!Ih");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 67, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h" + "'", str3, "!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...4   4...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4   4..." + "'", str1, "...4   4...");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("Hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("       hi#", "####          !ih####      !!!hhihhihh####          !ih####      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                    ", 6, "       hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                    " + "'", str3, "                                                                                                                    ");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", "hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#" + "'", str2, "hi!#");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ih      !", "Hi!!IH!IH!i#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !" + "'", str2, "ih      !");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i#", '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!I#", 24, "aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaahi!I#aaaaaaaaaa" + "'", str3, "aaaaaaaaahi!I#aaaaaaaaaa");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i!    ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!    " + "'", str2, "i!    ");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("h#", "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", 8, 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str4, "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                I", "!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!      hi  hi!      hi!      hi", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi..." + "'", str2, "hi...");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                    ", "hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                       !i!", "I...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("...   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("i#", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#        I##", " hI  hI...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str2, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi#", "", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                HI#!!IH!IH!                 ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                HI#!!IH!IH!                 " + "'", str2, "                HI#!!IH!IH!                 ");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i", "     hi ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("####", " Hi  Hi      Hi      Hi", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####" + "'", str3, "####");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                   i#                              ", "hi!i#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ih      !", "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("    !iH", "                 ..                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH" + "'", str2, "    !iH");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aa", 26, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!i!       aaHi!i!       " + "'", str3, "Hi!i!       aaHi!i!       ");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Hi!!IH!IH!i#!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!Ih", "aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "a###                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!      hi  hi!      hi!", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#!!IH!IH!", "..", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ih      !ih      !ih  ih      !ih  ", "hi!    ", "  hi!    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(" ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hi!I#", "                        hi#                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                    ", "                                                                                      !!!hhihhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi...", "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi..." + "'", str3, "hi...");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 369, (int) 'a');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!#Ih", "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", 121, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH" + "'", str4, "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 882, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H" + "'", str1, "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str1, "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH" + "'", str1, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str2, "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       hI!", "HI#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hI!" + "'", str2, "       hI!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!!IH!IH!", 4, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!" + "'", str3, "Hi!!IH!IH!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###", " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HI#       ", "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  hi!   ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH", "                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH", (int) 'a', "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH" + "'", str3, "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "       HI!", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI#       ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 50 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                I", "                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "#        I##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!    ", "hi!Hi!!IH!I", "Hi!!IH!IH!i#!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str1, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !", "ih      !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("       Hi!", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!" + "'", str2, "       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hI!", "  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!44", "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("i!hihi!hi!hi", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("h#", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h#" + "'", str2, "h#");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!i" + "'", str2, "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!i");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi", 99, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#################################################################################################" + "'", str3, "hi#################################################################################################");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi#", "                                                                                                                                  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!I#", "                                                                                                                    ", "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!I#" + "'", str3, "hi!I#");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!#iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!#i" + "'", str1, "!#i");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...4   4...", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4   4..." + "'", str2, "...4   4...");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("        I#", "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "        I#" + "'", str4, "        I#");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "!!!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!!!HHIHHIHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!HHIHHIHH" + "'", str1, "!!!HHIHHIHH");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("Hi!!IH!IH!i#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!   ", "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!!IH!IH!", "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i", "i!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       hI!", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "i#", 4, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!      hi  hi!      hi!      h", "I...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi#!", "!ih                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#" + "'", str2, "Hi#");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!IH                                                                                            ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                                                                                            " + "'", str2, "!IH                                                                                            ");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi#", "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  hi!      hi  hi!      hi!      h", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("    !iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! " + "'", str2, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                        hi#                         ", "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hi#                         " + "'", str2, "                        hi#                         ");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("  hi!    ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        I#", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  " + "'", str2, " h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         " + "'", str2, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI#       ", "  hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#       " + "'", str2, "HI#       ");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!      hi  hi!      hi!      h", "hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      " + "'", str2, "hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("####", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####" + "'", str2, "####");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str2, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!      hi  hi!      hi!      hi", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "                                                                                                                                                                                iH                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI" + "'", str1, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    !iH", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH" + "'", str2, "    !iH");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("       HI!                                                                                       ", "hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", (int) (short) -1, "hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H" + "'", str3, "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!", "", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...!ih ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!IH ..." + "'", str1, "...!IH ...");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                      ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" Hi  Hi      Hi      Hi", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("  HI", "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI" + "'", str2, "  HI");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("...4   4...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("i!    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!    " + "'", str2, "i!    ");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str1, "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("i!    ", "I!      hi  hi!      hi!      hi", (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!      hi  hi!      hi!      hi" + "'", str4, "I!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("HI#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                        hi#                         ", 352, "a###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###" + "'", str3, "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih " + "'", str1, "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!    ", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!    " + "'", str3, "!    ");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" h            h        h        ", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "   hi!    ", (int) '4', 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("HI#", strArray7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "       hi#");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray15);
        java.lang.String[] strArray17 = null;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ..", strArray15, strArray17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str16, "aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " .." + "'", str18, " ..");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" Hi!", "hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!" + "'", str2, " Hi!");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "!!!                                                                                                 ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444          ", " hI  hI...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                HI#!!IH!IH!                 ", 3, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                HI#!!IH!IH!                 " + "'", str3, "                HI#!!IH!IH!                 ");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!" + "'", str1, "HI#!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "!#Ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str1, "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                   i#                              ", "  hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   i#                              " + "'", str2, "                                   i#                              ");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih " + "'", str1, "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str1, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH" + "'", str2, "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       hI!", 352, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "          !ih", "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        " + "'", str3, "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str2, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "hi!      hi  hi!      hi!      hi", 882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!      hi  hi!      hi!      ", "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      " + "'", str2, "hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                HI#!!IH!IH!                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                iH                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH" + "'", str1, "iH");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                iH                                                                                                                                                                            ", "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "Hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                iH                                                                                                                                                                            " + "'", str3, "                                                                                                                                                                                iH                                                                                                                                                                            ");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("  HI!    ", "Hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Hi!    ", "       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!    " + "'", str2, "Hi!    ");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i" + "'", str2, "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       Hi!       ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "   hi!    ", (int) '4', 10);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!Ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Ih" + "'", str2, "!Ih");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("...!IH ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!IH ..." + "'", str1, "...!IH ...");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih" + "'", str1, "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "  HI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH" + "'", str2, "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("..", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("I...", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(" !i!", "                        hi#                         ", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("i", "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "####          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str2, "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("          !ih", "", (int) (short) -1, 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     !ih" + "'", str4, "     !ih");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                            Hi                                                                                                                                                                                ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 349 + "'", int2 == 349);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!#i", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("       hi#", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("          ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "a###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Hi#!", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#!" + "'", str2, "Hi#!");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#        I##", 44, "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#        I##  hi!      hi  hi!      hi!     " + "'", str3, "#        I##  hi!      hi  hi!      hi!     ");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("####          !ih####          !ih####          !ih####          !ih####          !####          !ih", (int) (byte) 0, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####          !ih####          !ih####          !ih####          !ih####          !####          !ih" + "'", str3, "####          !ih####          !ih####          !ih####          !ih####          !####          !ih");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("H", "                HI#!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi#!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", " ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " .." + "'", str2, " ..");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi...", "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih" + "'", str2, "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!!!                                                                                                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!                                                                                                 " + "'", str2, "!!!                                                                                                 ");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" Hi  Hi...", " h            h        h        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444444444444444", "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h#", "       hi#", "hi!    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("####          !IH", "###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "I#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!#i", "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#i" + "'", str2, "!#i");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!      hi  hi!      hi!      hi", "                       !i!", 882, (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!      hi  hi!      hi!      hi                       !i!" + "'", str4, "hi!      hi  hi!      hi!      hi                       !i!");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("Hi!i!       aaHi!i!       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i!       aaHi!i!       " + "'", str1, "hi!i!       aaHi!i!       ");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("i!    ", "     hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "iiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!" + "'", str1, "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444          ", "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444          " + "'", str2, "4444444444444444444444444          ");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi...", "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!!!HHIHHIHH", "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!IH", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', (int) (byte) 10, 0);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("###", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH", 44, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH" + "'", str3, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ..." + "'", str2, "  ...");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                     #######hi#", "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("     hi      hi      hi      hi !i", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi !i" + "'", str2, "   hi !i");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  HI!    ", 35, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa  HI!    " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaa  HI!    ");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("    !iH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("####", "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!#iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("... ", "  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI#", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", 67);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI#" + "'", str4, "HI#");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" ...", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("a###", "...!IH ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!!!HHIHHIHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!hhihhihh" + "'", str1, "!!!hhihhihh");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!i!       aaHi!i!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih" + "'", str1, "!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" Hi!", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", 99, 121);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str4, " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#", "                hi#!!IH!IH!                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("a###                                                                                     ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a###      " + "'", str2, "a###      ");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...4   4...", "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI#", 9, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     hi ", "!ih", "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h" + "'", str2, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("4444444444444444444444444          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("          !ih", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          !ih" + "'", str2, "          !ih");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaahi!I#aaaaaaaaaa", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ", "hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("...!ih ...", "..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI", "                                   i#                              ", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!Hi!!IH!IH!", " !i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" hi!", 116, "  Hi     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi" + "'", str3, " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!ih                                ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                " + "'", str2, "!ih                                ");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!#i");
        org.junit.Assert.assertNotNull(strArray1);
    }
}
