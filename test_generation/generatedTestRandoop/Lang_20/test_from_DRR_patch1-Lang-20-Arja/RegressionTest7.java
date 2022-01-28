import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      ########", "                                               ###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#####################4444hi!444###HHI!H44444444", "444444444444444444444444444444444444444444444444", "#444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444###HHI!H44444444" + "'", str3, "#####################4444hi!444###HHI!H44444444");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444444...", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##################### ####################", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh", "aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", "i4!4hi4!4hi4!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi", (java.lang.CharSequence) "hhh!ihhhhh", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", (java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                   hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "                                                   hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                    aaaaaaaaa444444444444444aaaaaaaa", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    aaaaaaaaa444444444444444aaaaaaaa" + "'", str2, "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("..4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444.." + "'", str1, "4444444444444444444444444444444..");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HHI!H...", (java.lang.CharSequence) "#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "      i!hi!hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444h!ih!ih!ih44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###HHI!H444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!H444444..." + "'", str1, "###HHI!H444444...");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("..444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..444444444444444444444444444444444444444h!ihh###" + "'", str1, "..444444444444444444444444444444444444444h!ihh###");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, (java.lang.CharSequence[]) strArray10);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444" + "'", str1, "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("##########");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                   ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi4hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "###hhi4hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "###HHI!HI!HI...", (java.lang.CharSequence) "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444..." + "'", str1, "4444444...");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#####           ######", (java.lang.CharSequence) "#####################       ####################", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", "                                                                    aaaaaaaa444444444444444aaaaaaaaa", 18);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HAAAAAAAA444444444444444AAAAAAAAAHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!" + "'", str1, "!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HAAAAAAAA444444444444444AAAAAAAAAHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray8, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", (java.lang.CharSequence[]) strArray12);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#################################################################################", (java.lang.CharSequence[]) strArray12);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 80 + "'", int16 == 80);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("....String;class [Ljava.lang....");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!h     ", "hi!hi!hi!h4444444444444###########################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hhi!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!h..." + "'", str1, "hhi!h...");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                  ", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!h                   4                  ", (int) '#', 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444h!ih!ih!ih44444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("   4h   44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4h   44" + "'", str1, "4h   44");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("   hi!hi!hi!h    ", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!hi!h444444444444444444444444444444444444444...", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!hi!h444444444444444444444444444444444444444..." + "'", str7, "Hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "###################################################HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44", "4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", 75);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("############################################################################################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################" + "'", str2, "############################################################################################");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#####HHI!HI!H#####HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi", "###h              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   hi!hi!hi!h    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaa4aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa4aaaaaaaaa" + "'", str1, "aaaaaaaa4aaaaaaaaa");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "ihi!!!!!!!!hhhhhhhhhhhhhhh!!!!!!!!!ihi", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444.....", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###################################################HI!HI!H444444444444444444444444444444444444444", 48, 149);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HI!HI!H444444444444444444444444444444444444444" + "'", str3, "###HI!HI!H444444444444444444444444444444444444444");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "TRUEA1A0A100A100A100", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444", 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444..." + "'", str3, "4444444...");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!h4444444444444###########################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#################################################################################", (java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                   hi!hi!h444444444444444444444444444444444444444...", "ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", 2, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI                                                 hi!hi!h444444444444444444444444444444444444444..." + "'", str4, " ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI                                                 hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", "#####################4444hi!444", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray12 = new char[] { 'a', 'a', '#', '#' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence7, charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!h########", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "        ", (java.lang.CharSequence) "444#444444444444444444444...444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "...4444...", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h!ih!ih!ih                     ", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                  ... ###hhi!h444444444444444444444444444444444444444...                   ", charSequence1, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H44444444444444444444444444444444" + "'", str1, "HI!H44444444444444444444444444444444");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44hi!hi!hi!hclass [ljava.lang.strin", "ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444..." + "'", str1, "4444444...");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###" + "'", str1, "ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##################### ####################", 149, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################### ####################" + "'", str3, "##################### ####################");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("               ", 17, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#               #" + "'", str3, "#               #");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                    aaaaaaaaa444444444444444aaaaaaaa", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    aaaaaaaaa444444444444444aaaaaaaa" + "'", str2, "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", (java.lang.CharSequence) "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###HHI!H444444...", "#####################4444hi!444####################", "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhHHI4H444444..." + "'", str3, "hhhHHI4H444444...");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#....String;class [Ljava.lang....##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "...4444...", (java.lang.CharSequence) "###HHI!HI!HI..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "i4!4hi4!4hi4!", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...               ...", (java.lang.CharSequence) "aa ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                    aaaaaaaaa444444444444444aaaaaaaa", (java.lang.CharSequence) "44444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                          ", (java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                          " + "'", charSequence2, "                          ");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                           ", "###hhi!h444444444444444444444444444444444444444...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!h444444444444444444444444444444444444444...", 41, "#               #");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..." + "'", str3, "hi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hi!hi!h444444444444444444444444444444444444444...");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaahhi!h..." + "'", str13, "aaaaaaaaaaaaaaaaaaaaaaaahhi!h...");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          hi!hi!hi!h", "....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                  ... ###hhi!h444444444444444444444444444444444444444...                   ", (java.lang.CharSequence) "....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray6, strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "..4444444444444444444444444444444", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str13, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                  ... ###hhi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  ... ###HHI!H444444444444444444444444444444444444444...                   " + "'", str1, "                  ... ###HHI!H444444444444444444444444444444444444444...                   ");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444444                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444" + "'", str1, "444444444444444");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444..h", (java.lang.CharSequence) "HI!HI!HI!H44444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C" + "'", charSequence2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i!hi!hi!", 81, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", (java.lang.CharSequence) "...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   " + "'", str1, "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "...", (java.lang.CharSequence) "###########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                               h", "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "4444444444", 41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               h" + "'", str4, "                                               h");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...ava.lang.String;class [C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ava.lang.String;class [C" + "'", str1, "...ava.lang.String;class [C");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                  44hi!hi!hi!h                   ", (java.lang.CharSequence) "truea1a0a100a100a100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("#####", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#", (int) (short) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str7, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44hi!hi!hi!hclass [ljava.lang.strin", (java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!h444hi!hi!hi!h44444444444444444..h", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                   hi!hi!hi!h444444444444444444444444444444444444444...                   ", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444..", 46, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         " + "'", str1, "                                         ");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("   444444444444hi!hi!hi!h4444444444444    ", "4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("    444444444444     ", 39, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaa...", "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", 47, 26);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                               ###hhi!h44444444444444444444444444444444##########", 924, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                   ... ###hhi!h444444444444444444444444444444444444444...                   ", "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", "hi!hi!hi!h4444444444444###########################################################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...!H4444444444444", (java.lang.CharSequence) "... ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", (java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                            ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                               ###hhi!h444444444444444444444444444444444444444...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("... ###hhi!h444444444444444444444444444444444444444...", "###HHI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ###hhi!h" + "'", str2, " ###hhi!h");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (java.lang.CharSequence) "", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...", "#####################4444HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', (int) (short) 10, (int) (byte) -1);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "########", (java.lang.CharSequence[]) strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aa ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HI!HI!H444444444444444444444444444444444444444...", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H4444444" + "'", str2, "HI!HI!HI!H4444444");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     ", "#....String;class [Ljava.lang....##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("    444444444444     ", "4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    444444444444     " + "'", str2, "    444444444444     ");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", "I!H                        ", "", 26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc" + "'", str4, "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                   ... ###hhi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!H444444444444444444444444444444444444444..", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#####           ######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####           ######" + "'", str1, "#####           ######");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!h44444444444444444444444444444444", (java.lang.CharSequence) "                                               4###4hhi4!4h444444444444444444444444444444444", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("###hhi!h444444444444444444444444444444444444444.....", "lcajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnaC[ ss");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lcajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnaC[ ss" + "'", str2, "lcajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnaC[ ss");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!H", "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H" + "'", str2, "hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hhh!ihhhhh", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hhh!ihhhhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                   hi!hi!hi!h444444444444444444444444444444444444444...                   ", "##########", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   " + "'", str3, "                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                            ", "44444444444444444444444...", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            " + "'", str3, "                                                                                            ");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###", "HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###" + "'", str2, "h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444HI!H!IH!IH!IH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!H!IH!IH!IH" + "'", str2, "HI!H!IH!IH!IH");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444.....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                          ", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("....String;class [Ljava.lang....##");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", (int) (byte) -1, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   #h   ##", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   #h   ##" + "'", str4, "   #h   ##");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("hi!hi!h444hi!hi!hi!h44444444444444444..h", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444hi!hi!hi!h44444444444444444..h" + "'", str2, "hi!hi!h444hi!hi!hi!h44444444444444444..h");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                      hi!hi!hi!ha..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  ", (java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  " + "'", charSequence2, "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  ");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444" + "'", str1, "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444", 81);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray8, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444                               ", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!h" + "'", str12, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "444444444444444                               " + "'", str14, "444444444444444                               ");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaa4aaaaaaaaa", "                                                                                      hi!hi!hi!ha..", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa4aaaaaaaaa" + "'", str3, "aaaaaaaa4aaaaaaaaa");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "!h44444444", (java.lang.CharSequence) "44hi!hi!hi!hclass [ljava.lang.strin");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!h44444444" + "'", charSequence2, "!h44444444");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "###HHI!HI!HI..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444...!h4444444444444", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "hi!hi!hi!h4...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ", (java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444h!ih!ih!ih44444444444", 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444h!ih!ih!ih44444444444" + "'", str3, "444444444444h!ih!ih!ih44444444444");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence) "                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("TRUEA1A0A100A100A100", 26, "!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HAAAAAAAA444444444444444AAAAAAAAAHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HITRUEA1A0A100A100A100" + "'", str3, "!HI!HITRUEA1A0A100A100A100");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "!h44444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 914 + "'", int2 == 914);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###################################################hi!hi!h444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "###################################################hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str8, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444444", "###HHI!H444444444444444444444444444444444444444...", 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444" + "'", str3, "444444444444444444444");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", (java.lang.CharSequence) "###HHI4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                   ... ###hhi!h444444444444444444444444444444444444444...                   ", 92, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###", "#!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H", (java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h     ", "#....String;class [Ljava.lang....##");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!hi!hi!h...", (java.lang.CharSequence) "###HHI4...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.lang.CharSequence charSequence6 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray12 = new char[] { 'a', 'a', '#', '#' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence7, charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   ", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "44444444444444444444444444444444444444444444444444444", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H", (java.lang.CharSequence) "hi!hi!hi!h                   4                  ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hhi!h4444444444...44444444...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hhi!h4444444444...44444444..." + "'", str3, "444hhi!h4444444444...44444444...");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444hhi!h4444444444...44444444..." + "'", str5, "444hhi!h4444444444...44444444...");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", 8, "444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C" + "'", str3, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...               ...", (java.lang.CharSequence) "4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...               ..." + "'", charSequence2, "...               ...");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh", (java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "###h              ", (java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   hi!hi!hi!h    ", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!hi!hi!h    " + "'", str2, "   hi!hi!hi!h    ");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h", (java.lang.CharSequence) "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444hi!444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                  44hi!hi!hi!h                   ", 92);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                               ", strArray5, strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####################4444HI!444#####################44", strArray11, strArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray20);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray20, strArray23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "###hhi!h444444444444444444444444444444444444444...");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("#", strArray15, strArray20);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str7, "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                               " + "'", str12, "                                               ");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#####################4444HI!444#####################44" + "'", str16, "#####################4444HI!444#####################44");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!hi!hi!h" + "'", str24, "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#" + "'", str27, "#");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444444444", (java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44hi!hi!hi!h", (java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                      hi!hi!hi!ha..");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444444444444...", (java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                    aaaaaaaa444444444444444aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    aaaaaaaa444444444444444aaaaaaaaa" + "'", str2, "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!ha...", 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "truea1a0a100a100a100", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("       ccc[[[        ", "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ccc[[[        " + "'", str2, "       ccc[[[        ");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444..aaaaaaaa44444444", "...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444..aaaaaaaa44444444" + "'", str2, "4444444444444444444444444444444..aaaaaaaa44444444");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                               ###hhi!h44444444444444444444444444444444", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444!ih4444#####################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str1, "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###HHI!H444444444444444444444444", "", "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI!H444444444444444444444444" + "'", str3, "###HHI!H444444444444444444444444");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "h", (java.lang.CharSequence) "                  ... ###HHI!H444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "       444...        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       444...        " + "'", str2, "       444...        ");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!h########", (java.lang.CharSequence) "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray5, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!h" + "'", str9, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444444444444444444444444444444aaaaaa", "ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 12, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444", 27, "...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#', '#' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####################4444hi!444#####################", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...                                       ###hhi!h444444444444444444444444444444444444444...", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("h", "I!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh", "###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444..." + "'", str1, "444...");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", "44hi!hi!hi!hclass [Ljava.lang.Strin", "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "       ccc[[[        ", (java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H", (java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!hi!hi!h     ", (java.lang.CharSequence) "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###", (java.lang.CharSequence) "444!ih4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444...!H4444444444444", "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "truea1a0a100a100a100");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###HHI!H444444...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "lcajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnaC[ ss", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 89 + "'", int3 == 89);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!h4444444444444444444444444444                                               h", 17, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!h4444444444444444444444444444                                               h" + "'", str3, "hi!hi!h4444444444444444444444444444                                               h");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###################################################HI!HI!H444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!H444444444444444444444444444444444444444" + "'", str2, "HI!HI!H444444444444444444444444444444444444444");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray1, strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.Class<?> wildcardClass16 = strArray15.getClass();
        java.lang.reflect.Type[] typeArray17 = new java.lang.reflect.Type[] { wildcardClass7, wildcardClass12, wildcardClass16 };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) typeArray17, ' ', 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str18, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##################### ####################", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################### ####################" + "'", str2, "##################### ####################");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!HI!HI!HI!H", "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444", "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", 75);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        char[] charArray7 = new char[] { ' ', '#', '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "###hhi4hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                               ###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###################################################HI!HI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) "444444444444444444444444444444444444444444", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444HI!444###hhi!h44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, "#####################4444HI!444###hhi!h44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444..aaaaaaaa44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444..AAAAAAAA44444444" + "'", str1, "4444444444444444444444444444444..AAAAAAAA44444444");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, (java.lang.CharSequence) "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#####################4444hi!444####################", "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 42, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h44444444444" + "'", str1, "hhi!hi!hi!h444444444444444444444444444444444444444...!h44444444444");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44hi!hi!hi!h", "###########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!h" + "'", str2, "44hi!hi!hi!h");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h", 0, "###HI!HI!H444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "###hhi!h444444444444444444444444444444444444444.....");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 41, "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", "444444444444444                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...###hhi!h444444444444444444444444444444444444444...", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "444444444444...", (java.lang.CharSequence) "###h", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                        ########", "HHI!H444444444444444444444444444444444444444...", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!H444444444444444444444444444444444444444..", 81, "#####################       ####################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############HI!HI!HI!H444444444444444444444444444444444444444..###############" + "'", str3, "###############HI!HI!HI!H444444444444444444444444444444444444444..###############");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                      h!ih!ih!ih...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                  44hi!hi!hi!h                   ", "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444h!ih!ih!ih444444444444", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", str2, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                        ########", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "4444hi!444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("truea1a0a100a100a100", "aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truea1a0a100a100a100" + "'", str2, "truea1a0a100a100a100");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...###hhi!h444444444444444444444444444444444444444...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("..4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..444444444444444444444444444444" + "'", str1, "..444444444444444444444444444444");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################" + "'", str3, "##########################");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str1, "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaa444444444444444aaaaaaaaa                                                                    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                    " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray5, strArray6, strArray7, strArray8 };
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray10, strArray11, strArray12, strArray13 };
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray15, strArray16, strArray17, strArray18 };
        java.lang.String[][][] strArray20 = new java.lang.String[][][] { strArray4, strArray9, strArray14, strArray19 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[][][]) strArray20);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!h4...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###h", "4444444444#######################################################################", "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###h" + "'", str3, "###h");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44hi!hi!hi!hclass [Ljava.lang.Strin", (java.lang.CharSequence) "          44hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                            ", (java.lang.CharSequence) "###########################", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44hi!hi!hi!h", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!h" + "'", str2, "44hi!hi!hi!h");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i!hi!hi!", 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      i!hi!hi!                                                                       " + "'", str2, "                                                                      i!hi!hi!                                                                       ");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hi!hi!h4444444444444", "4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        java.lang.CharSequence charSequence8 = null;
        java.lang.CharSequence charSequence9 = null;
        char[] charArray14 = new char[] { 'a', 'a', '#', '#' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence9, charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence8, charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                   ", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray6 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[][]) strArray6);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!", (java.lang.CharSequence) "...!H4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", (java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444h!ih!ih!ih444444444444", "44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444h!ih!ih!ih444444444444" + "'", str2, "4444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444#######################################################################", " ", 80, 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444############## #" + "'", str4, "4444444444############## #");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                  ... ###hhi!h444444444444444444444444444444444444444...                   ", (java.lang.CharSequence) "                                               h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#", "                                               ", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "444444444444444", (java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###HHI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) " ###hhi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("truea1a0a100a100a100", "                                                   hi!hi!h444444444444444444444444444444444444444..h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truea1a0a100a100a100" + "'", str2, "truea1a0a100a100a100");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "###HHI!H444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444!ih4444#####################", 25, "444!ih4444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444!ih4444#####################" + "'", str3, "444!ih4444#####################");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444aaaaaa", "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44", (java.lang.CharSequence) "aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!hi!hi!h444444444444444444444444444444444444444...", "#", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "4444hi!444" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!hi!hi!h444444444444444444444444444444444444444...", "#", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "4444hi!444" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                                                          ", (java.lang.CharSequence) "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                           ", (java.lang.CharSequence) "HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###HHI!HI!HI..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!h44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#####", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####" + "'", str2, "#####");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################" + "'", str2, "#################################################");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                   hi!hi!h444444444444444444444444444444444444444...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...          ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...          ########" + "'", str1, "...          ########");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#####################4444hi!444#####################", (java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###hhi!h444444444444444444444444444444444444444.....", "hi!hi!hi!h                   4                  ", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!h444444444444444444444444444444444444444....." + "'", str3, "###hhi!h444444444444444444444444444444444444444.....");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "44444444444444444444444444444444444444444444444444444", 26);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5, strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 25, 10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!444#####################44", (java.lang.CharSequence[]) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "44444444444444444444444444444444444444444aaaaaa", 25, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str10, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444444h!###4444444444444h!i", "#####################4444hi!444#####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444h!###4444444444444h!i" + "'", str2, "4444444444444h!###4444444444444h!i");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("..444444444444444444444444444444444444444h!ihh###", "HHI!HI!HI!HHI!HI!HI!HHI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..444444444444444444444444444444444444444h!ihh###" + "'", str2, "..444444444444444444444444444444444444444h!ihh###");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444444444444444", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444" + "'", str2, "444444444444444");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                               h", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444HI!H!IH!IH!IH", (java.lang.CharSequence) "H!ih!ih!ihaaaaaaaa444444444444444aa", 924);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i4!4hi4!4hi4!", (java.lang.CharSequence) "###############################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#444444444444444444444...", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (java.lang.CharSequence) "hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "#####################4444HI!444#####################44", (java.lang.CharSequence) "                  ... ###HHI!H444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hhi!hi!hi!h444444444444444444444444444444444444444...!h44444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h44444444444" + "'", str1, "hhi!hi!hi!h444444444444444444444444444444444444444...!h44444444444");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!HI!HI!H4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H4444444" + "'", str1, "HI!HI!HI!H4444444");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#################################################", (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#4#################################################4" + "'", str3, "#4#################################################4");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###H", (int) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444###H" + "'", str3, "444444###H");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", "#####################4444HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc" + "'", str2, "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444444...", "...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444..." + "'", str2, "444444444444444444444...");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!h#############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                                   ", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444..aaaaaaaa44444444", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("   4h   44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4h   44" + "'", str1, "4h   44");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444444444444", "hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!hi!hi!h    ", "#####################4444hi!444###HHI!H44444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4", 90);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444h!ih!ih!ih444444444444444444444", "###");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############HI!HI!HI!H444444444444444444444444444444444444444..###############", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str4, "4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str6, "4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!hi!h4444444444444444444444444444                                               h", (java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "#444444444444444444444...", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", "   444444444444hi!hi!hi!h4444444444444    ", 47);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "###hhi!h444444444444444444444444444444444444444...");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hhhHHI4H444444...", 21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "   ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...!H4444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                               h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               h" + "'", str1, "                                               h");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                               ###hhi!h44444444444444444444444444444444");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "###h");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str9, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444" + "'", str11, "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "H!ih!ih!ihaaaaaaaa444444444444444aa", 1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###################################################hi!hi!h444444444444444444444444444444444444444...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', 90, (int) '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("#####################4444hi!444####################", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#####################4444hi!444####################" + "'", str12, "#####################4444hi!444####################");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                   " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444h!ih!ih!ih44444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          " + "'", str1, "                                                                                          ");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 924 + "'", int1 == 924);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                          hi!hi!hi!h", (java.lang.CharSequence) "#####################4444hi!444####################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                      i!hi!hi!                                                                       ", "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H", "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      hi!hi!hi!ha..." + "'", str2, "                                                                                      hi!hi!hi!ha...");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aa ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa " + "'", str2, "aa ");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "... ###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "    444444444444     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444", "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444...", 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###" + "'", str1, "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", "                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!h4444444444444###########################################################################", 3, "h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h4444444444444###########################################################################" + "'", str3, "hi!hi!hi!h4444444444444###########################################################################");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hihihihihihihihihihi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                               ", "                          hhi!h444444444444444444444444444444444444444...                          ", "                      h!ih!ih!ih...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               " + "'", str3, "                                               ");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#####################4444HI!444#####################44", "aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa aa ", "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#####################4444HI!444#####################44" + "'", str4, "#####################4444HI!444#####################44");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("#####           ######", "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####           ######" + "'", str2, "#####           ######");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str1, "!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...ava.lang.String;class [C", "aaaaaaaa               aaaaaaaaa", 34);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                     ", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4h   44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("#4#################################################4", "", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###h");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#", (int) (short) 0);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray14, strArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray14);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray9, strArray14);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!h444444444444444444444444444444444444444...", strArray9, strArray24);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24, ' ');
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...4444...", (java.lang.CharSequence[]) strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!h" + "'", str18, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str20, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..." + "'", str25, "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!hi!h" + "'", str27, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" ###hhi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "                                                                                          hi!hi!hi!h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                               ###hhi!h444444444444444444444444444444444444444...", strArray3, strArray7);
        java.lang.Class<?> wildcardClass10 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                               ###hhi!h444444444444444444444444444444444444444..." + "'", str9, "                                               ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI                                                 hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str2, "                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", (java.lang.CharSequence) "hi!hi!hi!h                   4                  ", 914);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "#####################4444hi!444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "4h   44", "HI!H!IH!IH!IH", 90);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444" + "'", str4, "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          hi!hi!hi!h");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray10, strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44", strArray2, strArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44" + "'", str17, "HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "....String;class [Ljava.lang....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#####################4444hi!444#####################44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hhi!hi!hi!hhi!hi!hi", "4444444444444h!###4444444444444h!i", "HI!HI");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...                                       ###hhi!h444444444444444444444444444444444444444...", "I!H                        ", "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                       ###hhi!h444444444444444444444444444444444444444..." + "'", str3, "...                                       ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ", 7, "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  " + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                      h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      h!ih!ih!ih                    " + "'", str1, "                      h!ih!ih!ih                    ");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###############################################hi!hi!h444444444444444444444444444444444444444...", 25, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444", "HI!HI!HI!H4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444" + "'", str2, "444444444444444");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444h!###4444444444444h!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                     ", (java.lang.CharSequence) "ia!ahia!ahia!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("..4444444444444444444444444444444", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..4444444444444444444444444444444" + "'", str2, "..4444444444444444444444444444444");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          " + "'", str1, "                          ");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hi!hi!hi!h#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###HHI!H444444444444444444444444444444444444444..", "444444###H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H444444444444444444444444444444444444444.." + "'", str2, "###HHI!H444444444444444444444444444444444444444..");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ihi!!!!!!!!hhhhhhhhhhhhhhh!!!!!!!!!ihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "44444444444444444444444444444444444", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..", (java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       ccc[[[        ", 27, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######       ccc[[[        " + "'", str3, "######       ccc[[[        ");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444...!h4444444444444");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#####################4444hi!444####################", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!H44444444444", "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444hhi!h4444444444...44444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h444444444444444444444444444444444444444...", "                               ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###H", 17, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444hi!444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444hi!444" + "'", str2, "4444hi!444");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi", "44444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(".", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              .              " + "'", str2, "              .              ");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", "                                               h", "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str3, "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!HI" + "'", str2, " HI!HI");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!h     ", 5, "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h     " + "'", str3, "hi!hi!hi!h     ");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str2, "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################" + "'", str1, "##########################");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444444444444444444444...", (java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44", (java.lang.CharSequence) "#####################4444HI!444#####################44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "hi!hi!h444hi!hi!hi!h44444444444444444..h", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("H!ih!ih!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!h", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h" + "'", str3, "hi!hi!hi!h");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###", "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444", (java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#####################4444hi!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!44" + "'", str1, "#####################4444hi!44");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("H!IH!IH", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH" + "'", str2, "H!IH!IH");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("          ", "HI!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", "###HI!HI!H444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", 31, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin" + "'", str3, "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!hi!hi!h444444444444444444444444444444444444444...", "#", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "4444hi!444" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!hi!hi!h444444444444444444444444444444444444444...", "#", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "4444hi!444" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444############## #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444############## #" + "'", str1, "4444444444############## #");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "##########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###", (java.lang.CharSequence) "                           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###" + "'", charSequence2, "..444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###...444444444444444444444444444444444444444H!IHH###");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44" + "'", str1, "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444h!ihh###                                               ", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444h!ihh###                                               " + "'", str2, "44444444444444444444444444444444h!ihh###                                               ");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", "######       ccc[[[        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "              .              ", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str2, "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "   hi!hi!hi!h    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "TRUEA1A0A100A100A100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                       ###hhi!h444444444444444444444444444444444444444..." + "'", str1, "...                                       ###hhi!h444444444444444444444444444444444444444...");
    }
}

