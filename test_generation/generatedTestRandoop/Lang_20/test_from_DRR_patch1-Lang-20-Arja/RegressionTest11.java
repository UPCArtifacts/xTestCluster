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
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444                               ", "#####################4444hi!444#####################", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", "aaaaaaaa          444444444444444          aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str2, "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!H444444444444444444444444444444444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#               #");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#", "                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#" + "'", str2, "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444", 12, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444" + "'", str3, "444444444444444444444");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444" + "'", str1, "444444444444444");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "....String;class [Ljava.lang....##", (java.lang.CharSequence) "....String;class [Ljava.lang....##                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#h##", 31, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa#h##aaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaa#h##aaaaaaaaaaaaaa");
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ihi!!!!!!!!hhhhhhhhhhhhhhh!!!!!!!!!ihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ahi!h4#4#################################################java.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", "hi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!h4#4#################################################java.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str2, "ahi!h4#4#################################################java.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    444444444444     ", 75, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444    444444444444     " + "'", str3, "444444444444444444444444444444444444444444444444444444    444444444444     ");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444...!H4444444444444", "444hhi!h444444444444444444444444444444444444444...", "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444...!H4444444444444" + "'", str3, "4444444444444444444444444...!H4444444444444");
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "Hi!hi!h444444444444444444444444444444444444444...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!H44444444444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hihihihihihihihihihi", (int) (byte) 0, 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str8, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HHI!HI!HI!HHI!HI!HI!HHI!HI!", "!h44444444", "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("....String;class [Ljava.lang....", 53, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("H!IH!IH", "HHI!444444444444444444444444444444444444444HHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH" + "'", str2, "H!IH!IH");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               ", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", (int) (short) 100);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444h!ihh###                                               ", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("###HHI!H44444444444444444444444444444444", strArray4, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str8, "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444h!ihh###" + "'", str9, "44444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 6, 914);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44hi!hi!hi!hclass [ljava.lang.strin", "H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!hclass [ljava.lang.strin" + "'", str2, "44hi!hi!hi!hclass [ljava.lang.strin");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                            ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', (int) (short) 10, (int) (byte) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray0 = new org.apache.commons.lang3.StringUtils[][] {};
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray0);
        org.junit.Assert.assertNotNull(stringUtilsArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "   #h   ##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444############## #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444    444444444444     ", (java.lang.CharSequence) "4444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray1, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', (int) '#', 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!hi!hi!h");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aaaaaaaa444444444444444aaaaaaaaa");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 41, 27);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!" + "'", str14, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ahi!h4#4#################################################java.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ", "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   " + "'", str2, "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###################################################HI!HI!H444444444444444444444444444444444444444...", "4444444444444444444444444444444..aaaaaaaa44444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "4..h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 132 + "'", int1 == 132);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "4h   44", (java.lang.CharSequence) "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hi!hi!hi!h4444444444444", (java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444..#444444444444hi!H!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!hi!h4444444444444" + "'", charSequence2, "hi!hi!hi!h4444444444444");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi!hi!hhi!hi!hi!hhi!h########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!h########" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!h########");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 97);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str9, "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  " + "'", str10, "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  ");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ihaaaaaaaaa444444444444444aaaaaaaahihhihihihhihihihhihihihhihihihhihhihihihhihihihhihihihaaaaaaaaa444444444444444aaaaaaaahihhihihihhihihihhihihihhihihihhihhihihihhihihihhihihihaaaaaaaaa444444444444444aaaaaaaahihhihihihhihihihhihihih", "                           ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###HHI!HI!HI...", ".");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#####################4444hi!444#####################", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###", (int) (byte) 0, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiii..." + "'", str3, "iiiii...");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "#####################4444hi!444####################");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 ", strArray4, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                              ", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4h   44", "                      h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      h!ih!ih!ih                     " + "'", str2, "                      h!ih!ih!ih                     ");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "4444444444############## #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!" + "'", str2, "aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###hhi!h444444444444444444444444444444444444444.....", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444.....                                             " + "'", str2, "###hhi!h444444444444444444444444444444444444444.....                                             ");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("... ###hhi!h444444444444444444444444444444444444444...", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444" + "'", str2, "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 75, "                                                                                      hi!hi!hi!ha..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                           " + "'", str3, "                                                                           ");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                              hI!HI                                               ", (java.lang.CharSequence) "                                        44HI!HI!HI!H                                        ", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence6 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray12 = new char[] { 'a', 'a', '#', '#' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence7, charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    444444444444     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    444444444444     " + "'", str1, "    444444444444     ");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               ", (java.lang.CharSequence) "###################################################HI!HI!H444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                      h!ih!ih!ih                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
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
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444..h", charArray12);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!hi!h444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "Hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "##########################", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str1, "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#" + "'", str2, "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###HHI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 908 + "'", int2 == 908);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#", (int) (short) 0);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray15, strArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray15);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray10, strArray15);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("44hi!hi!hi!h", strArray5, strArray10);
        int int23 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#####################4444HI!444###hhi!h44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!h" + "'", str19, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str21, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "44hi!hi!hi!h" + "'", str22, "44hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          ##########################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, 21, 871);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "#               #", (java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', (int) '#', 0);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hi!hi!hi!h");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "aaaaaaaa444444444444444aaaaaaaaa");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("TRUEA1A0A100A100A100", "444hhi!h444444444444444444444444444444444444444...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("HHI!HI!HI!HHI!HI!HI!HHI!HI!", strArray7, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!" + "'", str16, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   hi!hi!h444444444444444444444444444444444444444...", "h!ih!ih!ih                     ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..." + "'", str5, "                                                   hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44..." + "'", str2, "44...");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "############", (java.lang.CharSequence) "!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...4444444444444444444444444ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("... ###hhi!h4444444444444444444444444444444...", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "#####################4444hi!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!", "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", 37, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaa444444444444444    aahi!aaaaa4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444" + "'", str4, "aaaaaaaa444444444444444    aahi!aaaaa4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#############################aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!############################", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444.....                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          hi!hi!hi!h" + "'", str1, "                                                                                          hi!hi!hi!h");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("#####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################" + "'", str1, "#####################################");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str2, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                     " + "'", str2, "                                                                                                                                                     ");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaa          444444444444444          aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" ", "#####################       ####################", "444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                     ", "                                               h", "i!hi!hhi!hi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###HHI!H444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#############################aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#4######################################", "44444444444444444444444444444444444444444aaaaaa", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h#44...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###HHI!HI!HI...", "###############HI!HI!HI!H444444444444444444444444444444444444444..###############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##########################", "HI!HI!HI!H44444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################" + "'", str2, "##########################");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "   h      h      h      h      h      h      h      h      h      h      h      h   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                          ", (java.lang.CharSequence) "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("iiiii...", "#####################4444hi!444", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H" + "'", str1, "HI!HI!HI!H");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray2, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) '#', 0);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "                  4                   h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                               ###h######hhhi###h!###hh###", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "  hi!hi!hi!ha..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###HHI!HI!HI...", (java.lang.CharSequence) "444..", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#4#################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH" + "'", str2, "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi", "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "                                         ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 99, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaa", 60, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444444444444444444444", (java.lang.CharSequence) "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "   4h   44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", "#444444444444444444444...", 37);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444" + "'", str5, "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", (java.lang.CharSequence) "##########################", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "####################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#....String;class [Ljava.lang....##", 59, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!444#####################44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("###############################################hi!hi!h444444444444444444444444444444444444444...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#############################aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!############################", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h444444444444444444444444444444444444444...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "444444444444h!ih!ih!ih44444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#####################4444hi!44");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###hhi!h444444444444444444444444444444444444444..." + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444444444444444", "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "444444444444444                                                                    ", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaa                                                                                                  aaaaaaaa444444444444444aaaaaaaaa                                                                                                  44444444" + "'", str6, "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaa                                                                                                  aaaaaaaa444444444444444aaaaaaaaa                                                                                                  44444444");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###h################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "00a100a100");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444h!ih!ih!ih444444444444", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", str6, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", 26, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..", (java.lang.CharSequence) "                        ########", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "      i!hi!hi!       ", (java.lang.CharSequence) "###4!4444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444444", "###########################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#               #", "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#               #" + "'", str2, "#               #");
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444hi!444", "4444444444444444444444444...!h4444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444", "hi!hi!hi!h...", "!h44444444", 92);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444" + "'", str4, "444444444444");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray6, strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444hi!444", strArray10, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'a', (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4444hi!444" + "'", str16, "4444hi!444");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi", (java.lang.CharSequence) "...###hhi!h                                       ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###HHI!HI!HI...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###", (java.lang.CharSequence) "   #H   ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "##########################", "HI!HI!HI!H4444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!h4...", "###################################################HI!HI!H444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h4..." + "'", str2, "hi!hi!hi!h4...");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                           ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#H" + "'", str1, "ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#H");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444#444444444444444444444...444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   h      h      h      h      h      h      h      h      h      h      h      h   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h      h      h      h      h      h      h      h      h      h      h      h" + "'", str1, "h      h      h      h      h      h      h      h      h      h      h      h");
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444" + "'", str2, "aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "   h      h      h      h      h      h      h      h      h      h      h      h   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                      h!ih!ih!ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      H!IH!IH!IH..." + "'", str1, "                      H!IH!IH!IH...");
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!hi!h4444444444444444444444444444                                               h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "##########################################################################################", 100, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "4444444444", (java.lang.CharSequence) "4444444444444444444444444444444", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444", "                                                   hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!h" + "'", str1, "44hi!hi!hi!h");
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!", (java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("######       ccc[[[ ...          ########", "aa ", 132);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######       ccc[[[ ...          ########" + "'", str3, "######       ccc[[[ ...          ########");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "truea1a0a100a100a100", 3, 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4h   44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444                                                                 hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence) "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444                                                                    " + "'", str1, "444444444444444                                                                    ");
    }
}

