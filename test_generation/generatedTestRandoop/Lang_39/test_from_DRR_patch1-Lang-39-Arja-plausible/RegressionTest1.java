import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" ...", (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!I#", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("       Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI!" + "'", str1, "       HI!");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" ...", " ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi!    ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!    " + "'", str2, "i!    ");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" hi!", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!" + "'", str2, " hi!");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", 352);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!!hhIHhIHh", (int) 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                      !!!hhIHhIHh" + "'", str3, "                                                                                      !!!hhIHhIHh");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!!IH!IH!i#!", "hi#", " hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!i#!" + "'", str3, "Hi!!IH!IH!i#!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                      !!!hhIHhIHh", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      !!!hhIHhIHh" + "'", str2, "                                                                                      !!!hhIHhIHh");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "       hi#", (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          ", (int) '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444          " + "'", str3, "4444444444444444444444444          ");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH", 350, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################################################################################################!IH##############################################################################################################################################################################" + "'", str3, "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  hi!      hi  hi!      hi!", 100, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!    " + "'", str1, "i!    ");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "  Hi     ", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" hi  hi!      hi!      hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("          !ih", "i!    ", "       HI!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          !ih" + "'", str4, "          !ih");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" ...", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       hI!", (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" ...", "                        hi#                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   ", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!      hi", "      hi ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!      hi", 0, "  HI!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" hi!", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!" + "'", str2, " hi!");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" hi  hi!      hi!      hi", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    !iH", "  hi!    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    !iH" + "'", str3, "    !iH");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", " hi!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(".", "ahi!", "    !i");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("#############################################################################################################################################################################!IH##############################################################################################################################################################################");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################################################################################################################!IH##############################################################################################################################################################################" + "'", str1, "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" Hi  Hi...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi..." + "'", str2, " Hi  Hi...");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                            Hi                                                                                                                                                                                ", "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("h", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi!    ", "                        HI#                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  HI!    ", "  Hi     ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!!IH!IH!i#!", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!", 100, " hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str3, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("      hi ", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                        hi#                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("       hi#", '#', 350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi" + "'", str1, "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str1, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("       hi#", "!!!hhIHhIHh", "                                                                                      !!!hhIHhIHh", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       hi#" + "'", str4, "       hi#");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  HI!      HI  HI!      HI!      H", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "", "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str3, "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih      !ih      !ih  ih      !ih  ", "!ih");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("  hi!      hi  hi!      hi!", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str8, "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi#", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      " + "'", str2, "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  Hi     ", "i!      hi  hi!      hi!      hi", "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!!!hi!!!!!", "hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 10, 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str4, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                        hi#                         ", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        hi#                         " + "'", str3, "                        hi#                         ");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    !i", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(" Hi  Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("  HI!    ", "    !iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!    " + "'", str2, "  HI!    ");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" Hi!", 17, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       Hi!       " + "'", str3, "       Hi!       ");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "!!!hhIHhIHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("4444444444444444444444444          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str1, "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("      hi ", "ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      hi " + "'", str2, "      hi ");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("4444444444444444444444444          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Hi!!IH!IH!i#!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("   ", "       HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    !i", '#', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("          ", (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi#!!IH!IH!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  hi!      hi  hi!      hi!      h", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 hi!      hi  hi!      hi!      h" + "'", str2, "                                                                 hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("       Hi!       ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih " + "'", str1, "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!    ", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!    " + "'", str2, "hi!    ");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("Hi!!IH!IH!", "", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str3, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!!!hi!!!!!", "      hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("       Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", (int) (short) 10, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str3, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI#", "hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("    !iH", "hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH" + "'", str2, "    !iH");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", (int) ' ', "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str3, "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("       hi#", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi#" + "'", str3, "       hi#");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                 hi!      hi  hi!      hi!      h", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 hi!      hi  hi!      hi!      h" + "'", str2, "                                                                 hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#", "       Hi!", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str2, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("       hI!", "  hi!      hi  hi!      hi!      hi", "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hI!" + "'", str3, "       hI!");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int int1 = org.apache.commons.lang3.StringUtils.length(" ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" ", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#" + "'", str1, "hi#");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("       HI!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!                                                                                       " + "'", str2, "       HI!                                                                                       ");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        int int1 = org.apache.commons.lang3.StringUtils.length("  hi!    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" hi  hi!      hi!      hi", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", 6, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str4, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("       HI!                                                                                       ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                      !!!hhIHhIHh", ' ', 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  hi!      hi  hi!      hi!      h", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str1, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("h", "hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!!!hi!!!!!", "    !i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                 hi!      hi  hi!      hi!      h", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 hi!      hi  hi!      hi!      h" + "'", str3, "                                                                 hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ahi!", (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!IH", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", "ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!I#", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!I#" + "'", str2, "hi!I#");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("#");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!      hi  hi!      hi!      hi" + "'", str1, "I!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                        hi#                         ", "    !i", "Hi!    ", 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                        hi#                         " + "'", str4, "                        hi#                         ");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", (int) (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str3, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str2, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!Hi!!IH!IH!", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hI  hI..." + "'", str1, " hI  hI...");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("Hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ih      !ih      !ih  ih      !ih  ", "hi!I#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!I#", "                                                                                                                                                                            Hi                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" ...", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  HI!    ", (-1), 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI" + "'", str3, "  HI");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  HI", " Hi  Hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" hI  hI...", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " ..." + "'", str1, " ...");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###" + "'", str3, "###");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!!IH!IH!i#!", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "Hi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi#", "       HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#" + "'", str2, "hi#");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      hi ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" ...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str1, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("i!    ", '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!hi!!!!!" + "'", str1, "!!!hi!!!!!");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (byte) 10, "       Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       Hi!" + "'", str3, "       Hi!");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih", "  hi!      hi  hi!      hi!      hi", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Hi!", "  hi!    ", 2);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("  HI!      HI  HI!      HI!      H", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "ahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                    ", "", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih                                                                                                 ", "!ih", "!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!                                                                                                 " + "'", str3, "!!!                                                                                                 ");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                 hi!      hi  hi!      hi!      h", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI#", "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I#" + "'", str2, "I#");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                 hi!      hi  hi!      hi!      h", "          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("   ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str2, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi#!!IH!IH!", "4444444444444444444444444          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444          " + "'", str2, "4444444444444444444444444          ");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      " + "'", str1, "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("I!      hi  hi!      hi!      hi", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("  HI!      HI  HI!      HI!      H", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str2, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!IH", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!iH", "          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!iH", "    !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!IH", 44, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!!!                                                                                                 ", (int) (byte) 10, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   ..." + "'", str3, "...   ...");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       hi#", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#" + "'", str2, "       hi#");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                            Hi                                                                                                                                                                                ", "   hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                            Hi                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                            Hi                                                                                                                                                                                ");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI#", "  hi!      hi  hi!      hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a', (int) '4', 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi#!", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...   ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!Hi!!IH!IH!", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!" + "'", str2, "!IH!IH!");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                        hi#                         ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hi#                         " + "'", str2, "                        hi#                         ");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" Hi  Hi      Hi      Hi", " hI  hI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih                                                                                                 ", "", (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih                                " + "'", str4, "!ih                                ");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("I#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i#" + "'", str1, "i#");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!!!hhIHhIHh", 2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("I", "###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          ", "i!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("  HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI" + "'", str1, "  HI");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...   ...", "       Hi!       ", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   ..." + "'", str3, "...   ...");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", "  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        char[] charArray2 = new char[] {};
        boolean boolean3 = org.apache.commons.lang3.StringUtils.containsNone("", charArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone("i!      hi  hi!      hi!      hi", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", 352, " Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str3, " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!" + "'", str1, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI", "", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("      hi ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi!      hi  hi!      hi!      h", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("       hI!", "       hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!ih", " Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", (int) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                        hi#                         ", "Hi!!IH!IH!i#!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi#!", "hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!" + "'", str2, "hi#!");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(".", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!!!hhIHhIHh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!hhIHhIHh" + "'", str2, "!!!hhIHhIHh");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!      hi  hi!      hi!      hi", 2, "!!!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str3, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i!    ", (-1), 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!    " + "'", str3, "i!    ");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!ih                                ", "hi!I#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!" + "'", str1, "hi#!!IH!IH!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", (int) (byte) 0, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str3, "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("       HI!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!" + "'", str2, "       HI!");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 352 + "'", int2 == 352);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                        HI#                         ", "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                         " + "'", str2, "                        HI#                         ");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str1, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("...   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   ..." + "'", str1, "...   ...");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str2, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "", "  HI!    ", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("i!      hi  hi!      hi!      hi", 2, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str3, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih" + "'", str2, "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" Hi  Hi      Hi      Hi", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi      Hi      Hi" + "'", str2, " Hi  Hi      Hi      Hi");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!!!hi!!!!!", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                            Hi                                                                                                                                                                                ", "I!      hi  hi!      hi!      hi", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                 hi!      hi  hi!      hi!      h", "!IH!IH!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str1, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ahi!", " Hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", " ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!!!hhIHhIHh", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH", "ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#############################################################################################################################################################################!IH##############################################################################################################################################################################", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################!IH##############################################################################################################################################################################" + "'", str2, "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!      hi  hi!      hi!      hi", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str3, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("###");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#!!IH!IH!", 44, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                hi#!!IH!IH!                 " + "'", str3, "                hi#!!IH!IH!                 ");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hi!!IH!IH!", "  HI!      HI  HI!      HI!      H", " Hi  Hi...", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!!IH!IH!" + "'", str4, "Hi!!IH!IH!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("       HI!                                                                                       ", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!                                                                                       " + "'", str2, "       HI!                                                                                       ");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi!", "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str1, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "Hi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 44, (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!iH", "    !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          !ih", 17, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####          !ih" + "'", str3, "####          !ih");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "hi!    ", (int) (short) 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("Hi!", "  hi!    ", 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("ih      !ih      !ih  ih      !ih  ", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("Hi!", "  hi!    ", 2);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!!IH!IH!", strArray15, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach(" Hi!", strArray10, strArray15);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("HI#", strArray5, strArray10);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!", "    !iH", (int) (byte) 0);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   ", strArray5, strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi#!!IH!IH!" + "'", str19, "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " Hi!" + "'", str20, " Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!I#" + "'", str21, "hi!I#");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(" hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#############################################################################################################################################################################!IH##############################################################################################################################################################################", "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      hi!", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    !i", charArray6);
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" Hi  Hi...", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i", "!ih", 352);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("i#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i#" + "'", str1, "i#");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       HI!", 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       HI!" + "'", str3, "       HI!");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("HI#", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i!      hi  hi!      hi!      hi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" Hi  Hi...", "   hi!    ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" hi!", (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("i!      hi  hi!      hi!      hi", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!    ", "i#", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444          ", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                      !!!hhIHhIHh", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ih      !ih      !ih  ih      !ih  ", "!!!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str2, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "i#", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("I#", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        I#" + "'", str2, "        I#");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...   ...", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("####          !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("!ih");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "    !iH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!      hi  hi!      hi!      hi", "!!!hi!!!!!", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h            h        h        " + "'", str3, " h            h        h        ");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("I!      hi  hi!      hi!      hi", 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", 2, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     hi " + "'", str3, "     hi ");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I#", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###", "...   ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" h            h        h        ", "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("i!      hi  hi!      hi!      hi", "  HI!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str2, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                 hi!      hi  hi!      hi!      h", 350, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       Hi!       ", " Hi  Hi      Hi      Hi", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" hi  hi!      hi!      hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi" + "'", str2, " hi  hi!      hi!      hi");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaa" + "'", str6, "aaa");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ih                                                                                                 ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("I!      hi  hi!      hi!      hi", "ahi!", "  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" hi  hi!      hi!      hi", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("!ih                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str2, " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("       Hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                      !!!hhihhihh" + "'", str1, "                                                                                      !!!hhihhihh");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i!      hi  hi!      hi!      hi", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str2, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("       Hi!       ", "!ih", "!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       Hi!       " + "'", str3, "       Hi!       ");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaa", " ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "####          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                hi#!!IH!IH!                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("####          !ih", '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      " + "'", str2, "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  hi!    ", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("       hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                      !!!hhihhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!hhihhihh" + "'", str1, "!!!hhihhihh");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                                                                                                                                                            Hi                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350 + "'", int1 == 350);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih      !ih      !ih  ih      !ih  ", (int) (byte) -1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str3, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("       Hi!", "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!IH!IH!", "                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!" + "'", str2, "!IH!IH!");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!IH!IH!", 4, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "#############################################################################################################################################################################!IH##############################################################################################################################################################################", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi" + "'", str4, "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str1, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!!!hi!!!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!hi!!!!!" + "'", str2, "!!!hi!!!!!");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "       HI!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (-1), "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", " h            h        h        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "!!!                                                                                                 ", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str3, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!IH", "   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!!!                                                                                                 ", "...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("       hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" Hi  Hi      Hi      Hi", 350, "  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! " + "'", str3, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("####          !ih", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", " hI  hI...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                        HI#                         ", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444          ", 2, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444          " + "'", str3, "4444444444444444444444444          ");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 'a', 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 44, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa" + "'", str3, "aaaaa");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " h            h        h        ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" Hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" Hi  Hi...", "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("!iH", strArray6, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!!hi!!!!!", strArray2, strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!iH" + "'", str11, "!iH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!!!hi!!!!!" + "'", str12, "!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!!!hhihhihh", " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" Hi  Hi...", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       HI!", (int) (short) 100, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("I!      hi  hi!      hi!      hi", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I!      hi  hi!      hi!      hi" + "'", str8, "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("          ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!    ", "          !ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih                                                                                                 ", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 " + "'", str2, "!ih                                                                                                 ");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi", "       hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!!IH!IH!", "hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("i!      hi  hi!      hi!      hi");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str1, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih", "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", '4', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "       hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("Hi!", "       hi#", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#############################################################################################################################################################################!IH##############################################################################################################################################################################", "                        HI#                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" Hi  Hi...", "       hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("       Hi!", "       HI!", "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       Hi!" + "'", str4, "       Hi!");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi#!", "!!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" h            h        h        ", "       Hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " h            h        h        " + "'", str2, " h            h        h        ");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444          " + "'", str3, "4444444444444444444444444          ");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!!IH!IH!i#!", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!i#!" + "'", str2, "Hi!!IH!IH!i#!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!#" + "'", str5, "hi!#");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaa", "       Hi!       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                            Hi                                                                                                                                                                                ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("       Hi!", strArray7, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  Hi     ", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 349 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "       Hi!" + "'", str11, "       Hi!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                    ", "      hi ", "                                                                                                                                                                            Hi                                                                                                                                                                                ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  Hi     ", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!!!                                                                                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(".", "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", "!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     hi ", 'a', 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!      hi  hi!      hi!      hi", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!      hi  hi!      hi!      hi" + "'", str3, "I!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaa", 0, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...   ...", "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       hi#", "hi!Hi!!IH!IH!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 6, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!IH", "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!    ", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih                                                                                                 ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                        HI#                         ", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                         " + "'", str2, "                        HI#                         ");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  hi!    ", "  HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  hi!      hi  hi!      hi!      hi", "                                                                                                                                                                            Hi                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "I");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "       HI!", (int) (byte) 100, 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str1, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("!ih", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("hi!    ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "aaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("####          !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####          !IH" + "'", str1, "####          !IH");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", "aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" Hi  Hi...", "                hi#!!IH!IH!                 ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("       HI!                                                                                       ", " hi  hi!      hi!      hi", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " .." + "'", str1, " ..");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" h            h        h        ", 4, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!" + "'", str1, "hi!      hi  hi!      hi!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!" + "'", str1, "HI#!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi", " ..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "     hi ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                        HI#                         ", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "!iH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaa", "      hi ", "  hi!    ", 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaa" + "'", str4, "aaa");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("####          !IH", "                        hi#                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("   ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       Hi!", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!" + "'", str2, "       Hi!");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!" + "'", str1, "hi#!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 116, 89);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str3, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "####          !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("       Hi!", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}
