import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   hi!hi!hi!h    ", (java.lang.CharSequence) "hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("... ###hhi!h444444444444444444444444444444444444444...", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   ... ###hhi!h444444444444444444444444444444444444444...                   " + "'", str2, "                   ... ###hhi!h444444444444444444444444444444444444444...                   ");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "                                                     #####################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaahhi!h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("444444444444hi!hi!hi!h4444444444444", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4...", "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4..." + "'", str2, "4...");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444..." + "'", charSequence2, "hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#####################4444hi!444#####################44", 46, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444#####################44" + "'", str3, "#####################4444hi!444#####################44");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "...                                       ###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "#####################4444hi!444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444!ih4444#####################", "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaa", "#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("#####################       ####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################       ####################" + "'", str1, "#####################       ####################");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("i4!4hi4!4hi4!", "#", 2, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#!4hi4!4hi4!" + "'", str4, "#!4hi4!4hi4!");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                    HI!HI!HI!H", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H" + "'", str2, "HI!HI!HI!H");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###", (java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5, strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 25, 10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str10, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh" + "'", str1, "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                               h", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###HHI!HI!HI...", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!h...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(charSequence0, (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("###################################################hi!hi!h444444444444444444444444444444444444444...", "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "###################################################hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444" + "'", str1, "444");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "          44hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", "4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str3, "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 10);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                          ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44", (java.lang.CharSequence) "###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (java.lang.CharSequence) "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "############################################################################################", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H", (java.lang.CharSequence) "4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                  44hi!hi!hi!h                   ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  44hi!hi!hi!h                   " + "'", str2, "                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "444444444444444                                                                    ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ", "....String;class [Ljava.lang....", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  " + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444HI!H!IH!IH!IH", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H", "hi!hi!hi!h     ", "4444444444##########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H" + "'", str3, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "4444444444444444444444444444444", 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH" + "'", str2, "H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###HHI!H44444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str2, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaa               aaaaaaaaa", "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H444444444444444444444444444444444444444.." + "'", str1, "HI!H444444444444444444444444444444444444444..");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###HHI!H444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H444444444444444444444444444444444444444..." + "'", str2, "###HHI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444hi!444", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h4444444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "    ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                               ", "4444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...4444...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "TRUEA1A0A100A100A100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("H!IH!IH", "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH" + "'", str2, "H!IH!IH");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ########", "###########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("....String;class [Ljava.lang....", "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....String;class [Ljava.lang...." + "'", str2, "....String;class [Ljava.lang....");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih", "444hhi!h4444444444...44444444...", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", (int) 'a', 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!H                        " + "'", str3, "I!H                        ");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###################################################hi!hi!h444444444444444444444444444444444444444...", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..." + "'", str3, "                                                   hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                            ", "hi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "                                ", (int) (short) 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "44444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("I!H                        ", strArray2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "I!H                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (java.lang.CharSequence) "HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (java.lang.CharSequence) "#####################4444hi!444####################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!aaaaaaaa444444444444444aaaaaaaaahi!", (java.lang.CharSequence) "444444444444h!ih!ih!ih44444444444", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "H!ih!ih!ih                                                                                          ", "...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "4...", 3, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4..." + "'", str4, "4...");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) "hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("....String;class [Ljava.lang....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....String;class [Ljava.lang...." + "'", str1, "....String;class [Ljava.lang....");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..4444444444444444444444444444444" + "'", str1, "..4444444444444444444444444444444");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   hi!hi!hi!h    ", "                               ", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                    aaaaaaaa444444444444444aaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 99, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444", "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444##########################################################################################", (java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hhi!h444444444444444444444444444444444444444...", 48, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444444444444444444444444444444444444444...", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444..." + "'", str2, "444444444444...");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#!4hi4!4hi4!" + "'", str1, "#!4hi4!4hi4!");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "hi!h44444444444444444444444444444444", (java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444...", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444444444444444444..", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444!ih4444#####################", (java.lang.CharSequence) "hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!hi!hi!h                   4                  ", (java.lang.CharSequence) "truea1a0a100a100a100", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...", (java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("###", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          hi!hi!hi!h");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                                  ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hhi!hi!hi!hhi!h########", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 91 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44", "i4!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44" + "'", str2, "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444444444444444444444444444444444444444", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444..." + "'", str2, "44444444444444444444444...");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                               h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h", "hi!hi!hi!h4...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", (java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("   444444444444hi!hi!hi!h4444444444444    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi!hi!hi!h4444444444444" + "'", str1, "444444444444hi!hi!hi!h4444444444444");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###", (java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("   4h   44", "hi!hi!hi!h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4h   44" + "'", str2, "   4h   44");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444   444", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444##########################################################################################", "444444444444444                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################" + "'", str2, "##########################################################################################");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..4444444444444444444444444444444", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", 924);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str2, "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!h44444444", (java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    444444444444     " + "'", str2, "    444444444444     ");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#", (int) (byte) 10, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("      ########", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                    ", "###HHI!HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaa               aaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                          hi!hi!hi!h", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4444444...", (java.lang.CharSequence) "###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ", (java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#!4hi4!4hi4!", (int) (byte) -1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hhi!hi!hi!hhi!hi!hi", "#####################4444HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hi!hi!hhi!hi!hi" + "'", str2, "hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "H!ih!ih!ih", 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str2, "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444hi!444", strArray11, strArray15);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray21);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray21, strArray24);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("   444444444444hi!hi!hi!h4444444444444    ", strArray11, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, '#', (int) (byte) 1, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444hi!444" + "'", str17, "4444hi!444");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!hi!hi!h" + "'", str25, "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "   444444444444hi!hi!hi!h4444444444444    " + "'", str26, "   444444444444hi!hi!hi!h4444444444444    ");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", 48, "444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str3, "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                  44hi!hi!hi!h                   ", 98, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   " + "'", str3, "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("i!hi!hi!", "...", 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!" + "'", str3, "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("....String;class [Ljava.lang....", "H!ih!ih!ih                                                                                          ", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", (java.lang.CharSequence) "44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                          ", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str2, "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaa444444444444444aaaaaaaaa                                                                    ", "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                    " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###" + "'", str1, "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44", (java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44" + "'", charSequence2, "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "          44hi!hi!hi!h", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", "444444444444h!ih!ih!ih44444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("i!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!" + "'", str1, "i!hi!hi!");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!h44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!h44444444" + "'", str1, "!h44444444");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa" + "'", str1, "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!h44444444444444444444444444444444", "                        ########", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444...44hi!hi!hi!h4444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...44hi!hi!hi!h4444444444444" + "'", str2, "4444444...44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#####################       ####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################       ####################" + "'", str1, "#####################       ####################");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h...", "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("      ########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "hi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                               h", "4444444444", 319);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               h" + "'", str3, "                                               h");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444444", "hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...ava.lang.String;class [C", (java.lang.CharSequence) "                      h!ih!ih!ih                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "    444444444444     ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ", (java.lang.CharSequence) "hi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########################################################################################", (java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "444hhi!h4444444444...44444444...", (java.lang.CharSequence) "..4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!H!ih!ih!ih", (java.lang.CharSequence) "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("44hi!hi!hi!h4444444444444", "hi", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                      hi!hi!hi!ha...", "44hi!hi!hi!h");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hhi!hi!hi!hhi!hi!hi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                   hi!hi!h444444444444444444444444444444444444444...", "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "                                                   hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444                               ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("....String;class [Ljava.lang....", "HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....String;class [Ljava.lang...." + "'", str2, "....String;class [Ljava.lang....");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#....String;class [Ljava.lang....##", "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!aaaaaaaa444444444444444aaaaaaaaahi!", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                      h!ih!ih!ih                     ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "#!4hi4!4hi4!", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!h", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h" + "'", str2, "hi!hi!hi!h");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "       444...        ", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444hi!444");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi", strArray9, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str18, "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "00a100a100", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444...                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444..." + "'", str1, "444...");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4444444444444h!###4444444444444h!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih", "aaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                     ", "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "4...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!HI!HI!H444444444444444444444444444444444444444..", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444", (java.lang.CharSequence) "I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaa444444444444444aaaaaaaaa", "444444444444444                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "..4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "4444444444444444444444444...!H4444444444444", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                ", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 46, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "          44hi!hi!hi!h", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!H444444444444444444444444444444444444444...", "hi!hi!hi!ha...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444###HHI!H44444444" + "'", str1, "#####################4444hi!444###HHI!H44444444");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                          hi!hi!hi!h", "HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "                                        44hi!hi!hi!h                                        ", 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                          hi!hi!hi!h" + "'", str4, "                                                                                          hi!hi!hi!h");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                            ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("    444444444444     ", "##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    444444444444     " + "'", str2, "    444444444444     ");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ", (java.lang.CharSequence) "   hi!hi!hi!h    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!444#####################44", 8, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################HI!HI!H444444444444444444444444444444444444444..." + "'", str1, "###################################################HI!HI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444" + "'", str2, "444444444444");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "444hhi!h4444444444...44444444...", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "444444444444", (java.lang.CharSequence) "############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "###########################", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.lang.Comparable<java.lang.String>[] strComparableArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(strComparableArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444h!###4444444444444h!i", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444h!###4444444444444h!i" + "'", str2, "4444444444444h!###4444444444444h!i");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!hhi!hi!hi" + "'", str1, "hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "44444444444444444444444...", (java.lang.CharSequence) "##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444" + "'", str2, "444444444444444");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444..", (java.lang.CharSequence[]) strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", 319, 100);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str10, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444...", "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444..." + "'", str2, "444...");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hi!hi", (java.lang.CharSequence) "444...                                                                                    ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("###H", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###H" + "'", str2, "###H");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                      hi!hi!hi!ha..", 924, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                           ", (java.lang.CharSequence) "4444444444##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444..aaaaaaaa44444444", "4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("H!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH" + "'", str1, "H!IH!IH");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###", (java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   hi!hi!hi!h    ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!hi!h    " + "'", str3, "   hi!hi!hi!h    ");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444", 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444444                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4...", "HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                               ###hhi!h44444444444444444444444444444444", "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               ###hhi!h44444444444444444444444444444444" + "'", str2, "                                               ###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444...                                                                                    ", "...4444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...                                                                                    " + "'", str2, "444...                                                                                    ");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4444444444444h!###4444444444444h!i", (java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444!ih4444", "44444444444444444444444444444444444444444444444444444", "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhh!ihhhhh" + "'", str3, "hhh!ihhhhh");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!h444444444444444444444444444444444444444..", "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###", "HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!h444444444444444444444444444444444444444.." + "'", str3, "hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h444444444444444444444444444444444444444...");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", "###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H" + "'", str2, "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          hi!hi!hi!h", 27, "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          hi!hi!hi!h" + "'", str3, "                                                                                          hi!hi!hi!h");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", "44444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444HI!H!IH!IH!IH", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 149);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444HI!H!IH!IH!IH" + "'", str3, "444444444444HI!H!IH!IH!IH");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa..." + "'", str1, "aaa...");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ", 3, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa " + "'", str3, "aa ");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "I!H                        ", (java.lang.CharSequence) "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", 99, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   4h   44", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   #h   ##" + "'", str3, "   #h   ##");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#####################4444hi!444###HHI!H44444444", 81, "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444###HHI!H44444444444444444444h!ih!ih!ih444444444444" + "'", str3, "#####################4444hi!444###HHI!H44444444444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "                        ########", "4444444444##########################################################################################", "...!H4444444444444", "                     ", "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444" };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!h44444444444444444444444444444444", charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444...", "4444444444444h!ih!ih!ih444444444444", "                                                                                            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HHI!H444444444444444444444444444444444444444...", "4444444444#######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!H444444444444444444444444444444444444444..." + "'", str2, "HHI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray6 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("I!H                        ", "hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!H" + "'", str2, "I!H");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "4444444444444444444444444444444..", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####################4444hi!444#####################", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#....String;class [Ljava.lang....##", 21, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#....String;class [Ljava.lang....##" + "'", str3, "#....String;class [Ljava.lang....##");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   444444444444hi!hi!hi!h4444444444444    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   444444444444hi!hi!hi!h4444444444444    " + "'", str2, "   444444444444hi!hi!hi!h4444444444444    ");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", (java.lang.CharSequence) "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", 0, 149);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444" + "'", str3, "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "   #h   ##", (java.lang.CharSequence) "444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hhi!h444444444444444444444444444444444444444...", 99, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          hhi!h444444444444444444444444444444444444444...                          " + "'", str3, "                          hhi!h444444444444444444444444444444444444444...                          ");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###hhi!h444444444444444444444444444444444444444...", "..4444444444444444444444444444444", "hi!H!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh" + "'", str3, "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#####################4444hi!444", "HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444444444444444..aaaaaaaa44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###########################################################################################", 35, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###hhi!h444444444444444444444444444444444444444...", 49, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!h444444444444444444444444444444444444444..." + "'", str3, "###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "TRUEA1A0A100A100A100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("      ########", "                                               h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###hhi!h44444444444444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44hi!hi!hi!h", (java.lang.CharSequence) "    444444444444     ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!hi!hclass [Ljava.lang.Strin", "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444h!###4444444444444h!i", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444h!###4444444444444h!i" + "'", str2, "4444444444444h!###4444444444444h!i");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!h...", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444" + "'", str1, "4444444444");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444                                                                    ", (int) ' ', "                                                                                 hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444                                                                    " + "'", str3, "444444444444444                                                                    ");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", "###HHI!H444444444444444444444444444444444444444...", "444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaahhi!h..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaahhi!h...");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "#####################4444hi!444####################", (java.lang.CharSequence) "4444   444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("       ccc[[[        ", "h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str1, "4444444444444444444444h!ih!ih!ih444444444444444444444");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!" + "'", str1, "HHI!HI!HI!HHI!HI!HI!HHI!HI!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) ".", (java.lang.CharSequence) "#####################4444hi!444####################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###############################################hi!hi!h444444444444444444444444444444444444444...", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444          ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "44hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444" + "'", str3, "444444444444444");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                                                                                                 ", "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###", 26, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hihihihihihihihihihi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h4444444444444###########################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444..." + "'", str1, "4444444444444444444...");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444!ih4444#####################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4444444444", (java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4444444444" + "'", charSequence2, "4444444444");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", (java.lang.CharSequence) "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44444444444444444444444...", (java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###h");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "4444444444444444444444444444444..aaaaaaaa44444444", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str1, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi!h44444444444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444   444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               ", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", (int) (short) 100);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                      h!ih!ih!ih                     ", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!H", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!h4444444444444###########################################################################", "...!H4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaa               aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa               aaaaaaaaa" + "'", str1, "aaaaaaaa               aaaaaaaaa");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "#####################4444hi!444####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.lang.CharSequence charSequence6 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray12 = new char[] { 'a', 'a', '#', '#' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence7, charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                    ", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str2, "!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               h", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444hhi!h4444444444...44444444...", (java.lang.CharSequence) "...ava.lang.String;class [C");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                               h", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###h              ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "hhi!h...", 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###hhi!h44444444444444444444444444444444", "                               ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          ", "", 31);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str9, "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###h              ", "#####################4444hi!444###HHI!H44444444", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444#444444444444444444444...444444444444444444", "#####################4444hi!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hi!hi!hi!hhi!hi!hi!hhi!h########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!h4444444444444444444444444444                                               h", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "444#444444444444444444444...444444444444444444", (java.lang.CharSequence) "###H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", "#444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444" + "'", str2, "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaa4aaaaaaaaa", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa4aaaaaaaaa" + "'", str2, "aaaaaaaa4aaaaaaaaa");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih", "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ", "444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!444#####################44", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", "...4444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("#", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444", "hi!H!ih!ih!ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                        ########", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("truea1a0a100a100a100", "#####################4444hi!444###HHI!H44444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "truea1a0a100a100a100" + "'", str3, "truea1a0a100a100a100");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444..." + "'", str1, "44444444444444444444444...");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!h     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####################       ####################", "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                                                                            ", (java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444...", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "    444444444444     ", (java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#####################4444HI!444#####################44", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#####################4444HI!444#####################44" + "'", str4, "#####################4444HI!444#####################44");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#444444444444444444444...", "#####################4444hi!444#####################");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "      ########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#444444444444444444444..." + "'", str4, "#444444444444444444444...");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", "aaaaaaaa444444444444444aaaaaaaaa                                                                    ", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444", (java.lang.CharSequence) "                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i!hi!hi!", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      i!hi!hi!       " + "'", str2, "      i!hi!hi!       ");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str1, "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                    aaaaaaaa444444444444444aaaaaaaaa", "HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4');
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#####################4444hi!444#####################", (java.lang.CharSequence[]) strArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#" + "'", str18, "#");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "i4!4hi4!4hi4!", (java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  44hi!hi!hi!h                   ", "444444444444444                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                           ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           " + "'", str2, "                           ");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################" + "'", str1, "##########################################################################################");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#####           ######", "                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#....String;class [Ljava.lang....##", (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444444444444444444444444444444...", (java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###", "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   4h   44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) ".", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#!4hi4!4hi4!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#!4hi4!4hi4!" + "'", str2, "#!4hi4!4hi4!");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, " ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 49, 35);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!h444444444444444444444444444444444444444..h", "h!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!h44444444", "h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h44444444" + "'", str2, "!h44444444");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HHI#HI#HI#HHI#HI#HI#HHI#HI#HI", "                                                                                                   ", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str3, "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "    ", 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444" + "'", str3, "#444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc" + "'", str1, "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "truea1a0a100a100a100", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###", (java.lang.CharSequence) "       ccc[[[        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!h444444444444444444444444444444444444444..h", "hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "4444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!h444444444444444444444444444444444444444..h", "44hi!hi!hi!h4444444444444", 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!h444hi!hi!hi!h44444444444444444..h" + "'", str3, "hi!hi!h444hi!hi!hi!h44444444444444444..h");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HHI!HI!HI!HHI!HI!HI!HHI!HI!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI" + "'", str2, "HHI!HI!HI!HHI!HI!HI!HHI!HI");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444", "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444" + "'", str4, "444444444444444");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h44444444444444444444444444444444" + "'", str1, "###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhh!ihhhhh", "444...                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", "###H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444#444444444444444444444...444444444444444444", (java.lang.CharSequence) "H!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 15, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaa...", "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44hi!hi!hi!h", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!h" + "'", str2, "44hi!hi!hi!h");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ", (java.lang.CharSequence) "H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444444444444444444", 34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                               ", (java.lang.CharSequence) "      i!hi!hi!       ", 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                        44hi!hi!hi!h                                        ", (int) (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        44hi!hi!hi!h                                        " + "'", str3, "                                        44hi!hi!hi!h                                        ");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...                                       ###hhi!h444444444444444444444444444444444444444...", "", "hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                       ###hhi!h444444444444444444444444444444444444444..." + "'", str3, "...                                       ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!hi!hi!h                   4                  ", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44hi!hi!hi!hclass [Ljava.lang.Strin", 39, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin" + "'", str3, "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!h444hi!hi!hi!h44444444444444444..h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                     ", "                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...!H4444444444444", 1, "          44hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!H4444444444444" + "'", str3, "...!H4444444444444");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###########################", "444444444444444444444444444444444444444...", 924);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 40, "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str3, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih444444444444444444444", (java.lang.CharSequence) "HI!H444444444444444444444444444444444444444..", 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhh!ihhhhh", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########################################################################################", (java.lang.CharSequence) "hi!hi!hi!h4444444444444", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("########", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########" + "'", str3, "########");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   ", "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 26, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444#######################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                      h!ih!ih!ih                     ", (java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray13, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444", strArray8, strArray17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str18, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444" + "'", str19, "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444..." + "'", str2, "44444444444444444444444...");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                          ", (java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "hi!H!ih!ih!ih", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "    444444444444     ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '4');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####################################################################################################", (int) '4', "...               ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################" + "'", str3, "####################################################################################################");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###################################################hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "       ccc[[[        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444hi!H!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi!H!ih!ih!ih" + "'", str1, "444444444444hi!H!ih!ih!ih");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str1, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..", "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444.." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "00a100a100", (java.lang.CharSequence) "        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ih!ih!ih                     ", "###H", 92);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h444444444444444444444444444444444444444...", "i!hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("#!4hi4!4hi4!", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', (int) (short) 10, (int) (byte) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

