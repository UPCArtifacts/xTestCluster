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
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI" + "'", str4, "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!" + "'", str1, "!i!");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!      hi  hi!      hi!hi!  hi!      hi  hi!####          !IHhi!      hi  hi!      hi!hi!  hi!      hi  hi! ", "I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "hi!HI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HiHiHiHiHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!", 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!      hi  hi!      hi!hi!  hi!      hi  hi!####          !IHhi!      hi  hi!      hi!hi!  hi!      hi  hi! " + "'", str4, "hi!      hi  hi!      hi!hi!  hi!      hi  hi!####          !IHhi!      hi  hi!      hi!hi!  hi!      hi  hi! ");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 130);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH" + "'", str1, "H  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" + "'", str1, "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("           hi#!!IH!IH!                 ", "HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIHI!HI!HIHI!HIHI!HI!hi!hihi!hi!hHIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!H", "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH...", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h" + "'", str1, "hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("i!      hi  hi!      hi!      hi", "      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          !IH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          !IH" + "'", str2, "          !IH");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(" hI!44 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         HHi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         HHi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         HHi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H" + "'", str3, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         HHi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         HHi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         HHi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("IaI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "Hi!!IH!IH!i#!", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  ...", "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                HI#!!IH!IH!                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "                                                                                                                                                                                iH                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!!hi#!iHhi#hi!hi#!!hi#!iHhi#hi!hi#h", "       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi#                     hi#                     hi#                     hi#                     h", "                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#                     hi#                     hi#                     hi#                     h" + "'", str2, "hi#                     hi#                     hi#                     hi#                     h");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                   I#                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!i!  ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         ", 65);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi" + "'", str4, "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH...", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!..." + "'", str2, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!...");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   hi  hi!      hi!      ", 12, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi  hi!      hi!      " + "'", str3, "   hi  hi!      hi!      ");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                           hi!    hI  hI...HI#!HI#!                                                                          ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  HI!      HI  HI!      HI!      H", (int) '#', 176);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaa####################################################                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaa####################################################                              " + "'", str1, "aaaaaaaaaaa####################################################                              ");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("!ih", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!    ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly(" hi!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaa!i", "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", "Hi#", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH...Ih  Ih ", "IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "                hi#!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " I#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, " I#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "... !iH !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!", "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!" + "'", str2, "!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ihHI!      HI  HI!      HI!      HI                       !I!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "       hi#hi!I#hi!I#hi!I#hi!I#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih " + "'", str2, "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!" + "'", str1, "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("       Hi!", strArray6, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      hi ", "                                                                                      !!!hhIHhIHh");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!!IH!IH!", strArray13, strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("   ", strArray6, strArray16);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("a##", strArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray16);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "       Hi!" + "'", str10, "       Hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!!IH!IH!" + "'", str17, "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "   " + "'", str18, "   ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!!!hi!!!!!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!i!iH         i!iH             !i!iH             !i!iH         i!iH             !i!ih", "                                                    I#                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I", "                                   i#                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("!!!hhihhihh", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("I#", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("###AAA", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#", "h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", " Hi  Hi      Hi      Hi", (int) (short) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("HI!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" + "'", str2, "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", "#######hi#", "...", 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I" + "'", str4, "!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH", "hi#hi!I#hi!I#hi!I#hi!I#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        int int1 = org.apache.commons.lang3.StringUtils.length("Ih                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                     HI#                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 356 + "'", int1 == 356);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#################################################################################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!i!       aaHi!i!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i" + "'", str1, "!ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", " h            h        h       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", "            !hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!" + "'", str2, "hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi#!", "  HI4...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi" + "'", str2, "i  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("...   ...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi" + "'", str2, "hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                HI4!!IH!IH!                 ", "!hi!hi!!#ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                HI4!!IH!IH!                 " + "'", str2, "                HI4!!IH!IH!                 ");
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       Hi!", "!IH", (int) (byte) 1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 341, 17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                     hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          hI  hI...HI#!HI#!HI#!HI#!HI#!...          ", "Hi#!", "     !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          hI  hI... I   I   I   I   I  ...          " + "'", str3, "          hI  hI... I   I   I   I   I  ...          ");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                " + "'", str2, "                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", ' ', 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##", "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!", 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!" + "'", str3, "       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!");
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("                         hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###                     ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      h", "                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", "aaaaaaaaaaaaaaaaaaaaaaaaaa  HI!    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!   " + "'", str1, "   hi!   ");
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!!ih!ih!                 #                hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  #hi#!#     ...", "####          !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  #hi#!#     ..." + "'", str2, "  #hi#!#     ...");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                    ", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    " + "'", str2, "                    ");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!", 4, "            !hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhhhh!hhhhhhhh!hhhhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!" + "'", str3, "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ", (int) '4', "!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      " + "'", str3, "ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!h", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!44" + "'", str1, "hI!44");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih", "####          !ih####      !!!hhihhihh####          !ih####      ", 67);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", (int) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      " + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str2, "      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hiHi!    Hi!    H", 25, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH                hi#!!IH!IH!                                                                                                                                                                                             Hi                                   ", '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   ", 130, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "Hi       Hi       H...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("I!44I!44I!44I!44I!44I!44hI!44I!44hI!44I!44I!44I!44I!44I!44hI!44I!44I!44I!44I!44I!44hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a###                      ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!i", 183, 350);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 183");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI  HI  HI  HI  HI  HI  HI  HI  HI", "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI  HI  HI  HI  HI  HI  HI  HI  HI" + "'", str2, "HI  HI  HI  HI  HI  HI  HI  HI  HI");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI", "####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi", "ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ", "a###      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ..." + "'", str3, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi#!", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  ", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                              ", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih" + "'", str2, "!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!hhihhihh");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!44", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                       ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                hi#!!ih!ih!                 ", "Hi!i!       aaHi!i!       ", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                hi#!!ih!ih!                 " + "'", str3, "                hi#!!ih!ih!                 ");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("H  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH" + "'", str2, "H  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH");
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  ...", "aaaaaaaaaa                                                                                      !!!hhIHhIHh", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi#!!IH!IH!", "##.##HI!######HI##HI!######HI!######H#################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444!HI!HI!!iH4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444!HI!HI!!iH4444444444444444444444444444444444444444444");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                   I#                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!" + "'", str1, "hi#!!IH!IH!");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "Hi       Hi       H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("################!!!hhihhihh#################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H", "I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!ih!ih!                                 HI", "aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("h  h  h  h  h  h  h  h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi#####################...      ", (-1), '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#####################...      " + "'", str3, "hi#####################...      ");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaa", 7, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa###" + "'", str3, "aaaa###");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "", "!IH!IH!", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str4, "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny(" Hi  Hi      Hi      Hi", charArray7);
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
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi#!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!    ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih                                                                                                 ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 82, "!Ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                             I#                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#" + "'", str1, "I#");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                hi#!!ih!ih!                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                hi#!!ih!ih!                 " + "'", str1, "                hi#!!ih!ih!                 ");
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hihi!hi!hihihi!hi!hi!hihi!...", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                                                                                                                   hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 202 + "'", int2 == 202);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...        hi#####################...      hi#####################...            hi#####################...      hi#####################...      hi#####################...        ", "a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                                                                                                                iH                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hiHi!    Hi!    H", "iiiiiiiiiiiiiiii", 176);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                     #######hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!i!       aaHi!i!       ", '#', 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "aaaaaaahi!aaaaaahiaahi!aaaaaahi!aaaaaahi", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 44, 183);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi  Hi      Hi      Hi" + "'", str1, " Hi  Hi      Hi      Hi");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                          hi!hihi!hi!hhi!hihi!hi!hH", "                 I#             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("hi", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("                                                                                                                                         #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i                                                                                                                                         ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str3, "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("aaaaaaaaahi!I#aaaaaaaaaa", "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) (short) 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HIHI!HI!HIHI!HIHI!HI!hi!hihi!hi!hHIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "       hi#", "                       !i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H" + "'", str3, "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("           hi#!!IH!IH!                 ", "hI#hI#hI#hI#hI#hI#hI#hI#!HI!HI!!#ihhI#hI#hI#hI#hI#hI#hI#hI#", 347);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                    ", "...", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaa" + "'", str1, "aaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaa");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH", "#        I##  hi!      hi  hi!      hi!    ", 270, 25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!H#        I##  hi!      hi  hi!      hi!    !IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH" + "'", str4, "!IH!Hi!!IH!IH!Hi!!IH!IH!H#        I##  hi!      hi  hi!      hi!    !IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hiIH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hiIH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str2, "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hiIH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. ", "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. ");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "HI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi#");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I#", "Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...   ...! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i!", "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH " + "'", str1, "!iH ");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaa###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!  HI!   ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H", "#######hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 95, 8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi#!" + "'", str5, "hi#!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#                         a###a###a###a###a###a###a###a###a###a###a###a..." + "'", str2, "hi#                         a###a###a###a###a###a###a###a###a###a###a###a...");
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                 hi!      hi  hi!      hi!      h", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!IH", "!iH", (int) (byte) 10);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", 26, "                 I#             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h" + "'", str3, "hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "h444444444444444444444444444444444444444444444444hi!444444444444444444444444444444444444444444444444  hi!      hihi hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi   hi!    hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("i!      hi  hi!      hi!      hi", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("!ih", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("hi!    ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                I", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH", 882, "HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H   Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IHHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H   " + "'", str3, "HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H   Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IHHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  HHI!44H  H  H  H  H  H  H    H        H   H   ");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!!hi#!iHhi#hi!hi#!!hi#!iHhi#hi!hi#h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "ih!ih!ihih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH" + "'", str2, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("      hi #!      ", "aaaaaaaaahi!I#aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi" + "'", str2, "       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAA HI  HI      HI      HIAAAAAAAA", "hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", 82);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAAA HI  HI      HI      HIAAAAAAAA" + "'", str5, "AAAAAAAAA HI  HI      HI      HIAAAAAAAA");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!!hi!!!!!", 369, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!!!hi!!!!!" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!!!hi!!!!!");
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi#                         a###a###a###a###a###a###a###a###a###a###a###a...", "                hi#!!IH!IH!                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#                         a###a###a###a###a###a###a###a###a###a###a###a..." + "'", str2, "hi#                         a###a###a###a###a###a###a###a###a###a###a###a...");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hihi!hi!hihihi!hi!hi!hihi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI!HI!HIHIHI!HI!HI!HIHI!..." + "'", str1, "HIHI!HI!HIHIHI!HI!HI!HIHI!...");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAA ", "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAA " + "'", str2, "AAAAAAAAA ");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                      ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!i!       aaHi!i!       ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I#", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("hi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !i", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#", "                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#" + "'", str2, "       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#       hi#");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "ih      !ih      !ih  ih      !i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  #hi#!#     ...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                                                                                                 " + "'", str1, "!IH                                                                                                 ");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("        I#        I#        I#  HI#                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH", "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#44444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !", "aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...hih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hih..." + "'", str1, "...hih...");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI  hI...HI#!HI#!HI#!HI#!HI#!...", "!iH ", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("!iH", strArray4, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 44, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih   ", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      ", strArray4, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!iH" + "'", str9, "!iH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("       Hi!       ", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("i#", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#" + "'", str2, "i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH", "       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str3, " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 349 + "'", int2 == 349);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH                hi#!!IH!IH!                                                                                                                                                                                             Hi                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI !I", " Hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ihHI!      HI  HI!      HI!      HI                       !I!", (int) 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihHI!      HI  HI!      HI!      HI                       !I!###################################" + "'", str3, "!ihHI!      HI  HI!      HI!      HI                       !I!###################################");
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" ...", "hi!i!       aaHi!i!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...!ih ...", "   hi !i                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!Hi!!IH!IH!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!!IH!IH!" + "'", str2, "hi!Hi!!IH!IH!");
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I", " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", "hi!      hi  hi!      hi!", 82);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I" + "'", str4, "I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hihi!hi!hhi!hihi!hi!hH", "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi!      hi  hi!      hi!      h", "!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###      !!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I..." + "'", str2, "#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I...");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      hi!      hi  hi!      hi!      h HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      H", "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", " ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str2, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("####################################################################################################################Hi!", "  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH" + "'", str1, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "                                                                                                                                                                                                                                                                                                                                              hi!i#", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                              hi!i#", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                              hi!i#" + "'", str2, "                                                                                                                                                                                                                                                                                                                                              hi!i#");
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("####          !IHhi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####          !IHhi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str1, "####          !IHhi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                       !i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!" + "'", str1, "!i!");
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi#...   ...!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!", 130);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!" + "'", str2, "H!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!");
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" hi!  ", "!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI# HI  HI...HI", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  hi!                                                                                                            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("!#Ih    HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("...4   4...", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  HI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!!IH!IH!                                 hi", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaHI!", 319);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       hi#hi!I#hi!I#hi!I#hi!I#hi", "hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("hi!      hi  hi!      hi!      hi", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ", charArray9);
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
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("hi", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("!ih", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!    ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly(" hi!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa" + "'", str1, "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##.##HI!######HI##HI!######HI!######H#################################################################################################################################################################################################################################", "  hI!hihI!!hI!      hI!hihI!  hI!hihI!!hI!      hI!hihI!!hI!      hI!h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!I", "444444444444444444444444444444444444444444444!ih!i...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("     hi      hi      hi      hi !i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ", 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                   " + "'", str2, "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                   ");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ", 349, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    !iH", "!Ih", 882);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("Hi!", "!IH");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!ih                                ", strArray4, strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!ih                                " + "'", str10, "!ih                                ");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("   hi!   ", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str2, "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ", "Hi!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                    ", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!    ####          !ih####      !!!hhihh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!      hi  hi!      hi!      h", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("I!44I!44I!44I!44I!44I!44hI!44I!44hI!44I!44I!44I!44I!44I!44hI!44I!44I!44I!44I!44I!44hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!hI!!ih!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 168, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!    ", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ih                                                                                                 ", (int) ' ', 1);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih                                                                                                 ", strArray11, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", strArray2, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!ih                                                                                                 " + "'", str14, "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str15, "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                         hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###" + "'", str1, "hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###");
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  ", "################!!!hhihhihh#################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  " + "'", str2, "  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  ");
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hI#hI#hI#hI#hI#hI#hI#hI#!HI!HI!!#ihhI#hI#hI#hI#hI#hI#hI#hI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI#hI#hI#hI#hI#hI#hI#hI#!HI!HI!!#ihhI#hI#hI#hI#hI#hI#hI#hI#" + "'", str1, "hI#hI#hI#hI#hI#hI#hI#hI#!HI!HI!!#ihhI#hI#hI#hI#hI#hI#hI#hI#");
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("        hI!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        hi!44" + "'", str1, "        hi!44");
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str1, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", 341);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "       hI!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', (int) (byte) 1, (int) (short) 0);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" !i!", "HI#");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny(" Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ", (int) (short) 10, "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            " + "'", str3, "                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 82, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IHhi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IHhi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!      hi  hi!      hi!      hi                       !i" + "'", str2, "i!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IHhi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IHhi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!      hi  hi!      hi!      hi                       !i");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "444444444444444444444444444444444444444444444444!#ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h444444444444444444444444444444444444444444444444!#ih444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!#Ih", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                     #######hi#", "aaaaaaaaaa!!!hhIHhIHh", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) 'a', 44);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#" + "'", str3, "hi#");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("h444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444  hi!      hihi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       Hi!", "!IH", (int) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("i!    ", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                      !!!hhIHhIHh", "ahi!");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("#        I##  HI!      HI  HI!      HI!     ", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                       ", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                       " + "'", str12, "                                                                                                                       ");
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaa    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #iaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaa    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #iaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                      !!!hhihhihh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("...#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("ih ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih " + "'", str1, "Ih ");
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("", "Hi!i!  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa" + "'", str1, "aaaaaaaaaa");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi#####################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" hi!", "!i!hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" hI  hI...", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hI  hI..." + "'", str2, " hI  hI...");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("HI#!");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!" + "'", str1, "HI#!");
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I...", 89, "!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  #h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I..." + "'", str3, "#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I...");
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("I...", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI !I", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IH", "hi!Hi!!IH!IH");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !i", 11, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !i" + "'", str3, "hi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !ihi !i");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!!IH!IH!", strArray7, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##", strArray3, strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 57, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi#!!IH!IH!" + "'", str11, "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##" + "'", str12, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi #!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  ", 0, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  " + "'", str3, "IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  ");
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI#!", 96, "                                                                                                                                                                             !                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              HI#!                                              " + "'", str3, "                                              HI#!                                              ");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI  HI  HI  HI  HI  HI  HI  HI  HI", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ' ', 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I...", "    ", "h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I..." + "'", str3, "#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I...");
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI !I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI !I" + "'", str1, "hI !I");
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str1, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ", 100, "hihi!hi!hihihi!hi!hi!hihi!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     " + "'", str3, "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", 0, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str3, "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str2, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("  Hi     ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("i!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "  Hi     ", (int) (byte) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 882, 121);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str5, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a                        hi#                         " + "'", str2, "###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a                        hi#                         ");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                   hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                  ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...                                                                                                                                          ", "hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...                                                                                                                                          " + "'", str2, "                                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...                                                                                                                                          ");
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa", "!iH ", 262);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!hI!!ih!i", "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi", 2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!hI!!ih!i" + "'", str5, "HI!hI!!ih!i");
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH...", '#', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  " + "'", str1, "ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444", "         I  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!!!                                                                                                 ", "####          !ih####      !!!hhihhihh####          !ih####      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!                                                                                                 " + "'", str2, "!!!                                                                                                 ");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str1, "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#        I##  hi!      hi  hi!      hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#I##hi!hihi!hi!" + "'", str1, "#I##hi!hihi!hi!");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi  Hi      Hi      Hi                                                                                                                                                                                                                                                               ", "hi#####################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("            HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI" + "'", str1, "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI", "!IH                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   hi !i", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       HI!                                                                                       ", "hi!  Hi       Hi       Hi       Hi       Hi       Hi       H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                                                                                       " + "'", str2, "I!                                                                                       ");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", 369, "I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!44I!44I!44I!44I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str3, "I!44I!44I!44I!44I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("####!ih####!ih####!ih####!ih####!####!ih", "HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  IH      !IH      !IH  IH      !IH  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      " + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI ", "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI " + "'", str2, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI ");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str2, "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                        hi#                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#" + "'", str1, "hi#");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#", "##.##HI!######HI##HI!######HI!######H#################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 11, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "... !iH !i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   hi!   ", "IaI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(" h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" Hi  Hi      Hi      Hi", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi      Hi      Hi" + "'", str3, " Hi  Hi      Hi      Hi");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!!IH!IH!", ".. ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                       ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH" + "'", str2, "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH");
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  hi!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!   " + "'", str1, "  hi!   ");
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" hi!", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!                                                                                                          " + "'", str2, " hi!                                                                                                          ");
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  hi!                                                                                                            ...", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                            hi!                                                                                                            ..." + "'", str2, "                                                                                                                                                                                                                                            hi!                                                                                                            ...");
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#", "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                HI4!!IH!IH!                 ", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("     !ih", 369);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!      hi  hi!      hi!      h", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      h" + "'", str2, "hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaa####################################################                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaa####################################################                              " + "'", str1, "aaaaaaaaaaa####################################################                              ");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       HI!                                                                                       ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "i!      hi  hi!      hi!      hi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi !i", "Hi...", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi!hIhI...HI#!HI#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("####!ih####!ih####!ih####!ih####!####!ih", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih#!#!ih#!ih#!ih#!ih" + "'", str2, "!ih#!#!ih#!ih#!ih#!ih");
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", 116, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str3, "...Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH...", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                     hi#", "Hi  Hi      Hi      Hi                                                                                                                                                                                                                                                               ", "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     hi#" + "'", str3, "                     hi#");
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!IH!IH!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!" + "'", str2, "!IH!IH!");
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi#!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!hihi!hi!hhi!hihi!hi!hH", "  Hi       Hi       H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!hhi!hihi!hi!hH" + "'", str2, "hi!hihi!hi!hhi!hihi!hi!hH");
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi  Hi      Hi      Hi", "!IH  HI!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i  Hi      Hi      Hi" + "'", str2, "i  Hi      Hi      Hi");
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                        HI#                         ", "!!IH!IH!                 #                hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                         " + "'", str2, "                        HI#                         ");
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("####", "                HI4!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!!!hi!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", 230);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("        hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!44" + "'", str1, "hi!44");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", '4', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaa!      hi", "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa!      hi" + "'", str2, "aaaaaaa!      hi");
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!!IH!IH!i#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!i#!" + "'", str1, "Hi!!IH!IH!i#!");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...hih...", "...4   4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 67, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                            hi!                                                                                                            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                            HI!                                                                                                            ..." + "'", str1, "                                                                                                                                                                                                                                            HI!                                                                                                            ...");
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!Hi!!IH!I", "   ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!!IH!I" + "'", str3, "hi!Hi!!IH!I");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("!!!hhihhihh", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", "hihi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h" + "'", str3, "hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" h            h        h        ", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                              HI#!                               ", 230, 12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("  hi!      hi  hi!      hi!      hi", "I#", "Hi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaHI!", 8, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ih ", "HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih " + "'", str2, "ih ");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("#        I##", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("!HI!HI!!#ih", charArray8);
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
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str1, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!HIHI!HI!HIHI!HIHI hi!  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HIHI!HI!HIHI!HIHI hi!  " + "'", str2, "!HIHI!HI!HIHI!HIHI hi!  ");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("           hi#!!IH!IH!                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           hi#!!IH!IH!                 " + "'", str1, "           hi#!!IH!IH!                 ");
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IHHI#!!IH!IH!hi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!Ihi!Hi!!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                     ", "i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#i#", 121);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa ", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa" + "'", str2, "aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa  ..aaaaaaaaa");
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h4 4!4I4h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                I", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                I" + "'", str2, "                                                                                                I");
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H ", "ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H" + "'", str2, "I  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      h", "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", (int) '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", 341);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "       hI!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                       ", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                       " + "'", str11, "                                                                                                                       ");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                HI#!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                           hi!    hI  hI...HI#!HI#!                                                                          ", "  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("        ", 118, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        " + "'", str3, "        ");
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "I...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h", 31, "I...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h" + "'", str3, "h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h");
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!...", " HI  HI  HI  HI  HI  HI  HI  HI  HI", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I", "IH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  ", "!Ih", 341);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I" + "'", str4, "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I");
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI", "Hi!!IH!IH!i#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                   I#                                             ", "ahi!", "H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   I#                                             " + "'", str3, "                                   I#                                             ");
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str1, "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                     hi#", 110, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444                     hi#4444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444                     hi#4444444444444444444444444444444444444444444");
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!44h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("###aaaaaaaa                                                                                     #######hi####aaaaaaaaa", "hi!Hi!!IH!IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################################################################################################################!IH##############################################################################################################################################################################" + "'", str1, "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!" + "'", str2, "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!");
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!!IH!IH!", "i#");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) '4', (int) (byte) 1);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaa!!!hhIHhIHh", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", 6, "!i!hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH" + "'", str3, "...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "       hI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("a", "!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      hi!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", charArray6);
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
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...                                                                                                                                          ", "...   ...! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...                                                                                                                                          " + "'", str2, "                                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!    ...                                                                                                                                          ");
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!IH", "!iH", (int) (byte) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "I" + "'", str6, "I");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "I" + "'", str9, "I");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "                                                                                                                                                                                                                                                                Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!#Ih    HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#Ih    HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "!#Ih    HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  HI!    ", "ih      !ih      !ih  ih      !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  Hi       Hi       H...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...   hi !i                           ...", "Hi#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("    !iH", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa!iH" + "'", str3, "aaaa!iH");
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("...!ih ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI", "  hi!      hi  hi!      hi!      hi", 339);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi", "  ...#######", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 347);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!h..." + "'", str2, "hi!h...");
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaa");
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("  hi!  ..", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                                                                                                                                                                                                                                                              hi!i#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                              hi!i#" + "'", str1, "                                                                                                                                                                                                                                                                                                                                              hi!i#");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!I!  ...", "!!!HHIHHIHH", "HI!I!  ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. ", "##.##HI!######HI##HI!######HI!######H#################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. ");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi#####################...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH", 26, 352);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi#####################...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH" + "'", str4, "hi#####################...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("    !iH", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!i!       aaHi!i!       ", "Hhi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#!I#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!i!       aaHi!i!       " + "'", str2, "Hi!i!       aaHi!i!       ");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("          !IH", "aaaaaaaaaa!!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("!!!HHIHHIHH", "!ih!i...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!      hi", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", ".");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ", "hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                " + "'", str2, "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                          I", "!#i                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hIhI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", " I#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hIhI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str2, "hi!hIhI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                         #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("       hI!", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaa                                                                                      !!!hhIHhIHh", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hIhI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!HI#!HI" + "'", str2, "HI#!HI#!HI");
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi", "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hiHi!    Hi!    H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("IaI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "aaaaaaa!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H" + "'", str1, "Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H");
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi#                         a###a###a###a###a###a###a###a###a###a###a###a...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  Hi       Hi       H...", "!hi!hi!!#ih", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("a###                      ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                   hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "a###      ", "I!44I!44I!44I!44I!44I!44hI!44I!44hI!44I!44I!44I!44I!44I!44hI!44I!44I!44I!44I!44I!44hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###");
        org.junit.Assert.assertNotNull(strArray1);
    }
}
