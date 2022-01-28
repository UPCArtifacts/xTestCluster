import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "", "", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!ih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!ih", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("", "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!ih", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih", "", "!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("Hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih", (int) (short) 0, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!IH", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!ih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) (short) -1, "!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!", "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH", "!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!ih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray8);
        java.lang.Class<?> wildcardClass10 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!", (int) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!    " + "'", str3, "   hi!    ");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!", "Hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi#!", "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi#!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#" + "'", str2, "hi#");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!IH", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   hi!    ", (int) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!    " + "'", str3, "  hi!    ");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi#!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!" + "'", str2, "hi#!");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi#", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#" + "'", str2, "hi#");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!", "!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!    ", (int) '#', "  hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi#!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!ih", "hi#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!IH", "hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hi!", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!" + "'", str2, " Hi!");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!ih", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 " + "'", str2, "!ih                                                                                                 ");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi!      hi  hi!      hi!      hi", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi#!", "!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  hi!      hi  hi!      hi!      hi", "!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi!      hi  hi!      hi!      hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!", "hi#!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!", 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!" + "'", str1, "hi#!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi!" + "'", str1, " Hi!");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi#!", 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(" Hi!", "hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "hi!", (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi#", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!", (int) (short) 10, "!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!" + "'", str3, "Hi!!IH!IH!");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!", "hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!ih                                                                                                 ", (int) ' ', 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  hi!      hi  hi!      hi!      hi", "", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  hi!      hi  hi!      hi!      hi", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi" + "'", str2, " hi  hi!      hi!      hi");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih                                                                                                 ", "  hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 " + "'", str2, "!ih                                                                                                 ");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi  hi!      hi!      hi" + "'", str1, " hi  hi!      hi!      hi");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!" + "'", str1, " hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#!!IH!IH!", (int) (byte) 10, " Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH!" + "'", str3, "hi#!!IH!IH!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi#", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#" + "'", str2, "       hi#");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" Hi!", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 " + "'", str2, "!ih                                                                                                 ");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          ", " Hi!", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!    ", " Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi#!!IH!IH!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", "Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" hi!", "  hi!    ", "       hi#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" Hi!", 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi!" + "'", str3, " Hi!");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "!IH", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "       hi#", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          ", "", "Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!" + "'", str1, "Hi!!IH!IH!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("  hi!      hi  hi!      hi!      hi", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      hi " + "'", str2, "      hi ");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("   Hi!    ", "!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI#", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                         " + "'", str2, "                        HI#                         ");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                                 " + "'", str1, "!ih                                                                                                 ");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!IH", strArray3);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "!ih", "", "" };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("   Hi!    ", strArray3, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ahi!", "       hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!" + "'", str2, "ahi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("   Hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi#!", "  hi!    ", "      hi ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!ih", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hi!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!" + "'", str2, "       Hi!");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                        HI#                         ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                         " + "'", str2, "                        HI#                         ");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!IH", "HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("          ", "      hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hi!!IH!IH!", 3, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("   Hi!    ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   Hi!    " + "'", str2, "   Hi!    ");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                                 " + "'", str1, "!ih                                                                                                 ");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   Hi!    ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi#!!IH!IH!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("      hi ", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      hi " + "'", str2, "      hi ");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("       hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                        HI#                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!", "HI#", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI#", "hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#" + "'", str2, "HI#");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("HI#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("  hi!    ", "h", "                        HI#                         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi#", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   hi!    ", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       Hi!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("h", 4, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("   Hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" hi!", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!" + "'", str2, " hi!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" hi  hi!      hi!      hi", "hi#!!IH!IH!", "Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi      Hi      Hi" + "'", str3, " Hi  Hi      Hi      Hi");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   Hi!    ", "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ih", "Hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("HI#", "hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!!IH!IH!", "ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#" + "'", str1, "hi#");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi!    ", " hi!", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  Hi     " + "'", str3, "  Hi     ");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents(" Hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi!" + "'", str1, " Hi!");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "       Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str1, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi#", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                        HI#                         ", "       hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!    ", '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!", " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!Hi!!IH!IH!", 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#!", "   Hi!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("  hi!      hi  hi!      hi!      hi", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI#", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" hi!", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!" + "'", str2, " hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi#!!IH!IH!", "ahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str1, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" Hi  Hi      Hi      Hi", "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!", 6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("hi#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("       hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  Hi     ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  Hi     " + "'", str2, "  Hi     ");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!Hi!!IH!IH!", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!!IH!IH!" + "'", str3, "hi!Hi!!IH!IH!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" hi!", "hi#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          ", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                        HI#                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi#", "       hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi#!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!" + "'", str2, "hi#!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  hi!    ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" hi  hi!      hi!      hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi" + "'", str2, " hi  hi!      hi!      hi");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" hi  hi!      hi!      hi", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  Hi     ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ahi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!" + "'", str2, "ahi!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  Hi     ", "   hi!    ", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  Hi     " + "'", str3, "  Hi     ");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  hi!      hi  hi!      hi!      hi", "       Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       hi#", 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" Hi!", "                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!" + "'", str2, " Hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  hi!    ", "  hi!    ", "", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#!", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi#", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(" hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       hi#", " hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("   Hi!    ", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!Hi!!IH!IH!", " Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi#!", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" Hi  Hi      Hi      Hi", "hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  Hi     ", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!" + "'", str3, "Hi!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "      hi ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "h", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI#", (int) (short) 10, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str1, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!" + "'", str1, "hi#!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "       hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi!    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!    " + "'", str2, "  hi!    ");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents(" Hi  Hi      Hi      Hi");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi  Hi      Hi      Hi" + "'", str1, " Hi  Hi      Hi      Hi");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  hi!      hi  hi!      hi!      hi", "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ahi!", " Hi  Hi      Hi      Hi", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ahi!", "ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!" + "'", str2, "ahi!");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" hi  hi!      hi!      hi", "      hi ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi" + "'", str2, " hi  hi!      hi!      hi");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!IH", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!Hi!!IH!IH!", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!    " + "'", str1, "  hi!    ");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("   Hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    !iH   " + "'", str1, "    !iH   ");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "Hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi#", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!IH", "                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi#", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#" + "'", str2, "hi#");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "       Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("h", "                        HI#                         ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ahi!", "hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("       Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#", "    !iH   ", 2, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    !iH   " + "'", str4, "    !iH   ");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi#!!IH!IH!", "  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str1, "  hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str1, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi#!!IH!IH!", "", "Hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("          ", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("          ", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi#", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   Hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   Hi!    " + "'", str1, "   Hi!    ");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  hi!      hi  hi!      hi!      hi", "       hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str2, "  hi!      hi  hi!      hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str1, "  hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi#", "  Hi     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#" + "'", str2, "hi#");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("          ", "       hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi!      hi  hi!      hi!      hi", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!ih", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ih      !ih      !ih  ih      !ih  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str2, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI#", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi#", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!Hi!!IH!IH!", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi#!", "Hi!!IH!IH!", 0, 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!!IH!IH!i#!" + "'", str4, "Hi!!IH!IH!i#!");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("   hi!    ", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    " + "'", str2, "   hi!    ");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" Hi  Hi      Hi      Hi", (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi..." + "'", str3, " Hi  Hi...");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih                                                                                                 ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 " + "'", str2, "!ih                                                                                                 ");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!IH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("    !iH   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi  hi!      hi!      hi" + "'", str1, " hi  hi!      hi!      hi");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (-1), ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, " Hi!", (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi#", "   hi!    ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str3, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!Hi!!IH!IH!" + "'", str1, "hi!Hi!!IH!IH!");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("#", "  hi!      hi  hi!      hi!      h", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("       hi#", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#" + "'", str2, "       hi#");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" Hi  Hi...", (int) (short) 100, "hi#!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str3, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("    !iH   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("      hi ", "ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "   hi!    ", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("    !iH   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350 + "'", int2 == 350);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!!IH!IH!i#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!Hi!!IH!IH!", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   Hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!    " + "'", str1, "   hi!    ");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  hi!      hi  hi!      hi!", "      hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" hi!", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" Hi  Hi      Hi      Hi", "      hi ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("          ", "  hi!      hi  hi!      hi!      hi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "hi!Hi!!IH!IH!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  hi!      hi  hi!      hi!", "", (int) (short) -1, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!      hi  hi!      hi!" + "'", str4, "i!      hi  hi!      hi!");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!Hi!!IH!IH!" + "'", str1, "hi!Hi!!IH!IH!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi#!", "i!      hi  hi!      hi!", "i!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!" + "'", str3, "hi#!");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str1, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("    !iH   ", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#", 0, "Hi!!IH!IH!i#!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#" + "'", str3, "hi#");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  hi!      hi  hi!      hi!      h", "       Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str2, "  hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("h", "HI#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  Hi     ", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  Hi     " + "'", str3, "  Hi     ");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" hi  hi!      hi!      hi", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi" + "'", str2, " hi  hi!      hi!      hi");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "ahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str2, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi!      hi  hi!      hi!      hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "      hi ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("    !iH   ", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str2, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!" + "'", str1, "ahi!");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(" Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "Hi!!IH!IH!i#!", 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!!IH!IH!i#!" + "'", str4, "Hi!!IH!IH!i#!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!IH", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi!", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("      hi ", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str1, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hi!!IH!IH!", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "HI#", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!!IH!IH!" + "'", str4, "Hi!!IH!IH!");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int1 = org.apache.commons.lang3.StringUtils.length("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi  Hi..." + "'", str1, "Hi  Hi...");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#", " Hi  Hi      Hi      Hi", (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "# Hi  Hi      Hi      Hi" + "'", str4, "# Hi  Hi      Hi      Hi");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("      hi ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    !iH   ", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH", "       hi#", "  hi!    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!", "       hi#", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", " Hi  Hi...", "i!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!iH", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   !iH    " + "'", str2, "   !iH    ");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "# Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("  hi!      hi  hi!      hi!", "hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str2, "  hi!      hi  hi!      hi!");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("# Hi  Hi      Hi      Hi", " Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "# Hi  Hi      Hi      Hi" + "'", str2, "# Hi  Hi      Hi      Hi");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("   Hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi!      hi  hi!      hi!      h", "ahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("       Hi!", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       Hi!" + "'", str4, "       Hi!");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#", "Hi!!IH!IH!i#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi#!", (int) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!" + "'", str3, "hi#!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi!      hi  hi!      hi!      h", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str2, "  hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        HI#                        " + "'", str1, "                        HI#                        ");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ahi!", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ih      !ih      !ih  ih      !ih  ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str2, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("    !iH   ", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH   " + "'", str2, "    !iH   ");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("#");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    !iH   ", "      hi ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH   " + "'", str2, "    !iH   ");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!  hihi!  hi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hihi!  hi!" + "'", str2, "hi!  hihi!  hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi#!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  hi!      hi  hi!      hi!      hi", "   !iH    ", "", 350);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str4, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!" + "'", str1, "HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       hi#", "!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#" + "'", str2, "       hi#");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" Hi  Hi...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi..." + "'", str2, " Hi  Hi...");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    " + "'", str2, "   hi!    ");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" Hi  Hi      Hi      Hi", (int) (short) 100, "i!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!" + "'", str3, "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ih      !ih      !ih  ih      !ih  ", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ahi!", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "!ih", (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!  hihi!  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  hihi!  hi!" + "'", str1, "hi!  hihi!  hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "i!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ahi!", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!" + "'", str3, "ahi!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("      hi ", "  hi!      hi  hi!      hi!      hi", (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str4, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("  hi!      hi  hi!      hi!      hi", "       hi#", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    !iH   ", " Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ih      !ih      !ih  ih      !ih  ", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int int1 = org.apache.commons.lang3.StringUtils.length("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!      hi", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 hi!      hi  hi!      hi!      hi                               " + "'", str2, "                                 hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "Hi!");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  hi!      hi  hi!      hi!      hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("       hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("i!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi#!!IH!IH!", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!" + "'", str2, "hi#!!IH!IH!");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("    !iH   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!", "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("i!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("   Hi!    ", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String[] strArray0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("  hi!      hi  hi!      hi!", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str2, "  hi!      hi  hi!      hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi#", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi  Hi...", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int1 = org.apache.commons.lang3.StringUtils.length("i!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi!      hi  hi!      hi!", 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str3, "  hi!      hi  hi!      hi!");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi#!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!" + "'", str2, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih                                                                                                 ", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi#!", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!" + "'", str2, "hi#!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                        HI#                         ", (int) '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        HI#                         " + "'", str3, "                        HI#                         ");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  hi!      hi  hi!      hi!", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!" + "'", str2, "i!      hi  hi!      hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" hi!", "", (int) (byte) -1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ahi!" + "'", str5, "ahi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi#!", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                        HI#                         ", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("  Hi     ", "   Hi!    ", "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi!", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!" + "'", str1, "hi#!!IH!IH!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   hi!    ", "Hi!!IH!IH!i#!", "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!    " + "'", str3, "   hi!    ");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, " Hi  Hi      Hi      Hi");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "       Hi!", (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   !iH    ", strArray4, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       Hi!", "   !iH    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" hi!", "Hi  Hi...", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!" + "'", str1, "hi!hihi!hi!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!" + "'", str1, "hi!      hi  hi!      hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("   !iH    ", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int1 = org.apache.commons.lang3.StringUtils.length("Hi!!IH!IH!i#!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("# Hi  Hi      Hi      Hi", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "# Hi  Hi      Hi      Hi" + "'", str2, "# Hi  Hi      Hi      Hi");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("    !iH   ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH   " + "'", str2, "    !iH   ");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Hi  Hi...", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi..." + "'", str2, "Hi  Hi...");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  hi!      hi  hi!      hi!      h", "ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("   Hi!    ", "Hi!", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    !iH   ", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH   " + "'", str2, "    !iH   ");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("          ", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!" + "'", str1, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                        HI#                        ", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("       hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       hi#" + "'", str1, "       hi#");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" Hi  Hi...", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi..." + "'", str2, " Hi  Hi...");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                        HI#                        ", "HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          h                        " + "'", str3, "                          h                        ");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  hi!      hi  hi!      hi!      hi", 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!     " + "'", str3, "  hi!     ");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hihi!hi!", " Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!" + "'", str2, "hi!hihi!hi!");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "i!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hihi!hi!", "# Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!" + "'", str2, "hi!hihi!hi!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("i!      hi  hi!      hi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" hi!", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!" + "'", str2, " hi!");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("# Hi  Hi      Hi      Hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "# Hi  Hi      Hi      Hi" + "'", str2, "# Hi  Hi      Hi      Hi");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi  Hi...", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi#", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#", "  hi!      hi  hi!      hi!      hi", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          " + "'", str1, "          ");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!!IH!IH!", "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#" + "'", str1, "hi#");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str1, "  hi!      hi  hi!      hi!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}
