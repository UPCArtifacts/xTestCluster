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
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###h              ", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444", (java.lang.CharSequence) "....String;class [Ljava.lang....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444...", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..." + "'", str2, "4444444...");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "   hi!hi!hi!h    ", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444", "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444" + "'", str2, "444444444444444444444");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents(";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc" + "'", str1, ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", 871);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                ", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444hi!hi!hi!h4444444444444" + "'", str2, "444444444444444444hi!hi!hi!h4444444444444");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "              ############################", (java.lang.CharSequence) "HI!HI!HI!H4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                        44hi!hi!hi!h                                        ", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###HHI!HI!HI..", (java.lang.CharSequence) "aaaaaaaa          444444444444444          aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hihih       444...        hihihi", (java.lang.CharSequence) "hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!H", "HI!HI!HI!H44444444444", "HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHIHHIHHIHHHIHHIHHIHHHIHHIHHhiIhiIhiIhHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...###HHHIH" + "'", str3, "HHHIHHIHHIHHHIHHIHHIHHHIHHIHHhiIhiIhiIhHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...###HHHIH");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                     #####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################" + "'", str1, "#####################################");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI", "...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI" + "'", str2, "HI!HI");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                              ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH" + "'", str1, "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444", (java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...###hhi!h444444444444444444444444444444444444444...", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###hhi!h                                       ..." + "'", str3, "...###hhi!h                                       ...");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "#####################4444hi!444", (java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "4444444444444444444444444444444..aaaaaaaa44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     " + "'", str2, "                                                     ");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###", "4444   444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray18, strArray22);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, 'a', 25, 10);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!", strArray9, strArray18);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str23, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!" + "'", str28, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444############## #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "# ##############4444444444" + "'", str1, "# ##############4444444444");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ", (java.lang.CharSequence) "...###hhi!h                                       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "###############################################hi!hi!h444444444444444444444444444444444444444...                                                     ", (java.lang.CharSequence) "    ############################", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!h444444444444444444444444444444444444444..." + "'", str1, "hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("####################################################################", "###HI!HI!H444444444444444444444444444444444444444", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI4!4HI4!4HI4!4H44444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60 + "'", int1 == 60);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aa ", "aaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa " + "'", str2, "aa ");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...!HHI!HI!HI!HHI!HI!HI###...", 92, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!HHI!HI!HI!HHI!HI!HI###...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!HHI!HI!HI!HHI!HI!HI###...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                          hi!hi!hi!h" + "'", str6, "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                          hi!hi!hi!h" + "'", str7, "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444...                                                                                    ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444.." + "'", str2, "444..");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("H#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH", 871, 149);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", (java.lang.CharSequence) "              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h" + "'", str5, "hi!hi!hi!h");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#4#################################################", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#4######################################" + "'", str2, "#4######################################");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", "44hi!hi!hi!hclass [Ljava.lang.Strin", 12);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###H", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#####           ######" + "'", str8, "#####           ######");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                  ... ###HHI!H444444444444444444444444444444444444444...                   ", "44444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  ... ###HHI!H444444444444444444444444444444444444444...                   " + "'", str2, "                  ... ###HHI!H444444444444444444444444444444444444444...                   ");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###h", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ia!ahia!ahia!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "############################################################################################", (java.lang.CharSequence) "aaaaaaaa4aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 31, "444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444hi!444444444444hi!h" + "'", str3, "444444444444hi!444444444444hi!h");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", (int) (short) 0, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc" + "'", str3, "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###" + "'", str1, "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "H!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH" + "'", str2, "H!IH!IH");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444", "....String;class [Ljava.lang....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("###HHI!H444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H444444444444444444444444" + "'", str2, "###HHI!H444444444444444444444444");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444...                                                                                    ", 195);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                          hhi!h444444444444444444444444444444444444444...                          ", "444444444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          hhi!h444444444444444444444444444444444444444...                          " + "'", str2, "                          hhi!h444444444444444444444444444444444444444...                          ");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444##########", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444##########" + "'", str2, "44444444444444444444444444444##########");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                               ###hhi!h44444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###HHI!H444444444444444444444444444444444444444...", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ihi!!!!!!!!hhhhhhhhhhhhhhh!!!!!!!!!ihi", "...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####", "               ", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "#####################4444hi!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str2, "                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) "hI4!4HI4!4HI4!4H44444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       " + "'", str3, "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.lang.CharSequence charSequence6 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray12 = new char[] { 'a', 'a', '#', '#' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence7, charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444...", (java.lang.CharSequence) "    ############################", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "IH#IH#IHH#IH#IH#IHH#IH#IH#IHH", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444444444444444h!ihh###", "#4#################################################4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  4                   h!ih!ih!ih" + "'", str1, "                  4                   h!ih!ih!ih");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444", "#####################4444hi!444###HHI!H44444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 100, 53);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str4, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444..", (java.lang.CharSequence) "4...", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################" + "'", str1, "############################################################################################");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                   ", 924);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 37, "444444444444444          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "###############", (java.lang.CharSequence) "                                                                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###############" + "'", charSequence2, "###############");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                        ########", (java.lang.CharSequence) "44444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "444444444444h!ih!ih!ih44444444444", (java.lang.CharSequence) "    ############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "###HHI!HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh", (java.lang.CharSequence) "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "       ccc[[[        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###h", "hi!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        java.lang.CharSequence charSequence17 = null;
        char[] charArray22 = new char[] { 'a', 'a', '#', '#' };
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence17, charArray22);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray22);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444hi!444", charArray22);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", charArray22);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray22);
        java.lang.Class<?> wildcardClass28 = charArray22.getClass();
        java.lang.Class[] classArray30 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass3;
        wildcardClassArray31[1] = wildcardClass7;
        wildcardClassArray31[2] = wildcardClass12;
        wildcardClassArray31[3] = wildcardClass28;
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray31);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[]) wildcardClassArray31);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray31);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C" + "'", str40, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C" + "'", str41, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C" + "'", str42, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "44444444444444444444444...", (java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!H" + "'", str1, "HI!HI!H");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#####################################", "HHI!HI!HI!HHI!HI!HI!HHI!HI###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi", "h!ih!ih!ih", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#####################################" + "'", str4, "#####################################");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444", "4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444" + "'", str2, "4444444444444444444444444");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, (java.lang.CharSequence) "hi!hi!h444hi!hi!hi!h44444444444444444..h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4444444444444444444444444444444..aaaaaaaa44444444", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...###hhi!h                                       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###hhi!h                                       .." + "'", str1, "...###hhi!h                                       ..");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                             hi!                                                                                                                                                             ", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhi!hi!hi!h444444444444444444444444444444444444444...!h44444444444", "aaaaaaaaaaaaaaaaaaaaaaaah", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("h!ih!ih!ih", "                                                                    aaaaaaaa444444444444444aaaaaaaaa", (int) (short) 0, 59);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                    aaaaaaaa444444444444444aaaaaaaaa" + "'", str4, "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!H44444444444444444444444444444444", 75);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444", "   hi!hi!hi!h    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa4444444444444444444444444444444444444444");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("######       ccc[[[        ", "                                               h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######       ccc[[[        " + "'", str2, "######       ccc[[[        ");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h                   4                  " + "'", str1, "hi!hi!hi!h                   4                  ");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("        ", "                          hhi!h444444444444444444444444444444444444444...                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        " + "'", str2, "        ");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                     ", (java.lang.CharSequence) "4444hi!444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHhhi#h444444444444444444444444444444444444444.....", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   " + "'", str2, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...!H4444444444444", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!H4444444444444" + "'", str2, "...!H4444444444444");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" HI!HIhihih       444...        hihihi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!HHI!HI!HI!HHI!HI!HI###...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!HIhihih       444...        hihihi" + "'", str2, " HI!HIhihih       444...        hihihi");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) " ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI                                                 hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "hi!H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("####################################################################################################", "44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("######", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("###HHI!HI!HI...", "                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI..." + "'", str2, "###HHI!HI!HI...");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                          hhi!h444444444444444444444444444444444444444...                          ", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                   ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################" + "'", str1, "#################################################################################");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hhh!ihhhhh", (java.lang.CharSequence) "                  ... ###HHI!H444444444444444444444444444444444444444...                   ", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444hi!444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###h              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", (java.lang.CharSequence) "hi!hi!hi!h4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HHI!H...", "###############################################hi!hi!h444444444444444444444444444444444444444...", "###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHI!H..." + "'", str3, "HHI!H...");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444...", "...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444..." + "'", str2, "444...");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("....String;class [Ljava.lang....", "aaaaaaaa               aaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                             hi!                                                                                                                                                             ", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              " + "'", str2, "                                              ");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#!4hi4!4hi4!", "h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#!4hi4!4hi4!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#!4hi4!4hi4!");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####" + "'", str1, "#####");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", 41, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaa4aa..." + "'", str3, "...aaaaaaaa4aa...");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                    HI!HI!HI!H", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    HI!HI!HI!H" + "'", str3, "                                    HI!HI!HI!H");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "444!ih4444#####################", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444!ih4444#####################" + "'", charSequence2, "444!ih4444#####################");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "######", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", (java.lang.CharSequence) "444444444444hi!H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc", charArray10);
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
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H444444444444444444444444444444444444444.." + "'", str1, "HI!H444444444444444444444444444444444444444..");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                    aaaaaaaaa444444444444444aaaaaaaa" + "'", str1, "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh" + "'", str1, "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH" + "'", str1, "4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                              ", 53, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     " + "'", str3, "                                                     ");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!h44444444", (java.lang.CharSequence) "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh                                                  ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!", 97, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!############################" + "'", str3, "#############################aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!############################");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44" + "'", str2, "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [", 75, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [" + "'", str3, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HHI!444444444444444444444444444444444444444HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!444444444444444444444444444444444444444HHI!" + "'", str1, "HHI!444444444444444444444444444444444444444HHI!");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                      h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      H!IH!IH!IH                     " + "'", str1, "                      H!IH!IH!IH                     ");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...4444444444444444444444444ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###", "###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!..." + "'", str2, "...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str1, "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!H!ih!ih!ih", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###hhi!h444444444444444444444444444444444444444..." + "'", str1, "...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444", 319, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "4444hi!444", (java.lang.CharSequence) "                      h!ih!ih!ih                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "i4!4hi4!4hi4!", (java.lang.CharSequence) "              ############################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "i4!4hi4!4hi4!" + "'", charSequence2, "i4!4hi4!4hi4!");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aa ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                          ", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...###hhi!h444444444444444444444444444444444444444...", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###hhi!h444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444" + "'", str3, "...###hhi!h444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...###hhi!h                                       ...", "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#!4hi4!4hi4!", 69, "######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#!4hi4!4hi4!" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#!4hi4!4hi4!");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!aaaaaaaa444444444444444aaaaaaaaahi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!444444444444444hi!" + "'", str2, "hi!444444444444444hi!");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###########444444444444hi!H!ih!ih!ih############");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.lang.CharSequence charSequence6 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray12 = new char[] { 'a', 'a', '#', '#' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence7, charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H" + "'", str1, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...                                       ###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#', '#' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###h", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hihihihihihihihihihi", (java.lang.CharSequence) "4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hihihihihihihihihihi" + "'", charSequence2, "hihihihihihihihihihi");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("i4!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i4!4hi4!4hi4!" + "'", str1, "i4!4hi4!4hi4!");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("#############################aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################AAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAHI!############################" + "'", str1, "#############################AAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAHI!############################");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ihaaaaaaaaa444444444444444aaaaaaaahihhihihihhihihihhihihihhihihihhihhihihihhihihihhihihihaaaaaaaaa444444444444444aaaaaaaahihhihihihhihihihhihihihhihihihhihhihihihhihihihhihihihaaaaaaaaa444444444444444aaaaaaaahihhihihihhihihihhihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", 871, "4444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa4444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA4444444444444444444444444444444444444444444444444444" + "'", str3, "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa4444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", (java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!h44444444444444444444444444444444", 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "44hi!hi!hi!h4444444444444", "!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HAAAAAAAA444444444444444AAAAAAAAAHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                   hi!hi!hi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("H!ih!ih!ih", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih!ih" + "'", str2, "H!ih!ih!ih");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                    ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444hi!444", "444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444", "       444...        ", 89, 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444       444...        " + "'", str4, "444       444...        ");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "       ccc[[[        ", (java.lang.CharSequence[]) strArray3);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####################################################################################hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###h", "###hhi4hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH" + "'", str1, "!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      " + "'", str3, "                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      4444444444                   4444444444444444444444444444444444444444444444444                      ");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", (java.lang.CharSequence) "                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444HI!H!IH!IH!IH", 0, 75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444HI!H!IH!IH!IH" + "'", str3, "444444444444HI!H!IH!IH!IH");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444" + "'", str1, "444444444444444");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "   #h   ##", (java.lang.CharSequence) "###H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444       444...        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444444444444444444444444444444444444444444444444444444444444444444", "h!ih!ih!ih", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (java.lang.CharSequence) "#############################aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 899 + "'", int2 == 899);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("###################################################HI!HI!H444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################HI!HI!H444444444444444444444444444444444444444" + "'", str1, "###################################################HI!HI!H444444444444444444444444444444444444444");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5, strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, '4');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str12, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "444" + "'", str16, "444");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####################################################################################hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################" + "'", str2, "############################################################");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                      h!ih!ih!ih                     ", 7, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      h!ih!ih!ih                     " + "'", str3, "                      h!ih!ih!ih                     ");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray8, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '4');
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###h", (java.lang.CharSequence[]) strArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray12);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               hi!" + "'", str2, "                                                                                               hi!");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                  ", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (java.lang.CharSequence) "#####################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str2, "...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!h" + "'", str8, "hi!hi!hi!h");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!H444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!H444444444444444444444444444444444444444" + "'", str2, "HI!HI!H444444444444444444444444444444444444444");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!h" + "'", str8, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44hi!hi!hi!hclass [ljava.lang.strin", "444444444444444                               ", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!h444444444444444444444444444444444444444.." + "'", str1, "hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("#####################4444hi!44", "               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ", "HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "#####################4444HI!444#####################44", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA44444444", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444.." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#", (java.lang.CharSequence) "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "00a100a100");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###################################################hi!hi!h444444444444444444444444444444444444444...", "444!ih4444#####################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##....String;class [Ljava.lang....##", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   #h   ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#h##" + "'", str1, "#h##");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#####################4444hi!444####################", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "################################################################################################################################################################################################################################################################################################################################################################################", 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                    aaaaaaaa444444444444444aaaaaaaaa", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ..." + "'", str2, "  ...");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!H!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!" + "'", str3, "#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("    444444444444     ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    444444444444     " + "'", str2, "    444444444444     ");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H", (java.lang.CharSequence) "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 181 + "'", int2 == 181);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "i4!4hi4!4hi4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = strArray15.getClass();
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.Class<?> wildcardClass20 = strArray19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass16, wildcardClass20 };
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str22, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   " + "'", str1, "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################" + "'", str2, "#################################################");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!h44444444", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444..." + "'", str1, "444444444444444444444444444444444444444...");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444...", "                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("   #H   ##", 35, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc" + "'", str1, "[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!h444444444444444444444444444444444444444..", "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444.." + "'", str2, "hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444h!ih!ih!ih44", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444h!ih!ih!ih44" + "'", str2, "4444444444444444444444h!ih!ih!ih44");
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                        44hi!hi!hi!h                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        44HI!HI!HI!H                                        " + "'", str1, "                                        44HI!HI!HI!H                                        ");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HHHhhi#h444444444444444444444444444444444444444.....", "########", "44444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHhhi#h444444444444444444444444444444444444444....." + "'", str3, "HHHhhi#h444444444444444444444444444444444444444.....");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "####################################################################", (java.lang.CharSequence) "a44...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444h!ihh###                                               ", "hi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                     ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        ", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih444444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                 hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence) "###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ihaaaaaaaaa444444444444444aaaaa", "Hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", 29);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!hclass [Ljava.lang.Strin" + "'", str1, "44hi!hi!hi!hclass [Ljava.lang.Strin");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###", "hi!hi!h444444444444444444444444444444444444444...", "HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###" + "'", str3, "###");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444hi!444444444444hi!h", (java.lang.CharSequence) "    ", 871);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                     #####################################", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444..", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("i!hi!hi!", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i!hi!hi!" + "'", str7, "i!hi!hi!");
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "               ", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!h" + "'", str7, "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!h" + "'", str9, "hi!hi!hi!h");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#####################4444hi!444####################", (java.lang.CharSequence) "###########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    ############################", 34, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44    ############################" + "'", str3, "44    ############################");
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444hi!444444444444hi!h", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", "4444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "hi!hi!h444hi!hi!hi!h44444444444444444..h", "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###h", "hi!");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "               ", (java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444..h", (java.lang.CharSequence[]) strArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                          ", (java.lang.CharSequence[]) strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ', 12, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " HHI!HI!HI!HHI!HI!HI!HHI!HI######### ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444444444444444h!ih!ih!ih444444444444", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "    444444444444     ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", "#4#################################################", 25, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ahi!h4#4#################################################java.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str4, "ahi!h4#4#################################################java.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi!hi!hi!h4444444444444" + "'", str1, "444444444444hi!hi!hi!h4444444444444");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444" + "'", str1, "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h", '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("44    ############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44    ############################" + "'", str1, "44    ############################");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("... ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... ###hhi!h444444444444444444444444444444444444444..." + "'", str1, "... ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444############## #", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444hi!444", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                         #4#################################################4", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...4444...", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "#####################4444HI!444#####################44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                 IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "######");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                    ", (java.lang.CharSequence) "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!H444444444444444444444444444444444444444...", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 1);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!", (java.lang.CharSequence) "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H", "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...ava.lang.String;class [C", (java.lang.CharSequence) "HI!HI!HI!H", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "i!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               ###hhi!h44444444444444444444444444444444##########");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                    aaaaaaaaa444444444444444aaaaaaaa", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    aaaaaaaaa444444444444444aaaaaaaa" + "'", str2, "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h44444444444444444444444444444444" + "'", str1, "###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                      hi!hi!hi!ha..", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!hi!hi!ha.." + "'", str2, "  hi!hi!hi!ha..");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444.." + "'", str3, "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444#####################44" + "'", str1, "#####################4444hi!444#####################44");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############################################hi!hi!h444444444444444444444444444444444444444...                                                     ", "   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                      i!hi!hi!                                                                       ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      i!hi!hi!                                                                       " + "'", str2, "                                                                      i!hi!hi!                                                                       ");
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!h44444444", "hi!hi!hi!h#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#", 899);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "      i!hi!hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44", 16, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                     #####################################", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444...!h4444444444444", "###HHI!H444444444444444444444444444444444444444...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444", 47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444...!h4444444444444" + "'", str4, "4444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("              ", "##########################################################################################", "", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "              " + "'", str4, "              ");
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444", "hhi!h...", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi" + "'", str1, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi");
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hI!HI", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              hI!HI                                               " + "'", str2, "                                              hI!HI                                               ");
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" HI!HI", "4444444444444444444444444444444..", 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HI!HI" + "'", str3, " HI!HI");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str1, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444h!ih!ih!ih444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444###H", "                  ... ###HHI!H444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444###H" + "'", str2, "444444###H");
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence8 = null;
        java.lang.CharSequence charSequence9 = null;
        char[] charArray14 = new char[] { 'a', 'a', '#', '#' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence9, charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence8, charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny(charSequence1, charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#############################AAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAHI!############################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#h##", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ", (java.lang.CharSequence) "#################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.substringsBetween("", "###h              ", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        java.lang.reflect.Type[] typeArray18 = new java.lang.reflect.Type[] { wildcardClass4, wildcardClass8, wildcardClass12, wildcardClass17 };
        java.lang.reflect.Type[][] typeArray19 = new java.lang.reflect.Type[][] { typeArray18 };
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(typeArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) typeArray19, "                                                                                          HI!HI!HI!H", 319, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str1, "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                               hi!", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444..", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               ###HHI!H44444444444444444444444444444444" + "'", str1, "                                               ###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("....String;class [Ljava.lang....##", "                                ", 59, 871);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "....String;class [Ljava.lang....##                                " + "'", str4, "....String;class [Ljava.lang....##                                ");
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                                                                                                                                             hi!                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("....String;class [Ljava.lang....##", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....String;class [Ljava.lang....##" + "'", str3, "....String;class [Ljava.lang....##");
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "...###hhi!h444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444", (java.lang.CharSequence) "#####HHI!HI!H#####HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("##################### ####################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "#####################       ####################", (java.lang.CharSequence) "                      H!IH!IH!IH                     ", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###########################################################################################", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str2, "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        char[] charArray4 = new char[] { 'a', '#', '4', ' ' };
        char[] charArray9 = new char[] { 'a', '#', '4', ' ' };
        char[][] charArray10 = new char[][] { charArray4, charArray9 };
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(charArray10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, #, 4,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc", "                      H!IH!IH!IH                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc" + "'", str2, ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h", (int) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h                                                                                                   " + "'", str3, "h                                                                                                   ");
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence) "                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444.....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                   ", (int) (short) 10, "hi!hi!hi!hhi!hi!hi!hhi!h########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                   " + "'", str3, "                                                                                                   ");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                         ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!h                   4                  ", "444       444...        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h                   4                  " + "'", str2, "hi!hi!hi!h                   4                  ");
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444", (java.lang.CharSequence) "444444444444444                                                                    ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        " + "'", str1, "        ");
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#####################4444hi!444", "                                                                                 hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444" + "'", str2, "#####################4444hi!444");
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "4444444444444444444444444###HHI!HI!HI...", (java.lang.CharSequence) "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44" + "'", str1, "#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!h########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "4h   44", (java.lang.CharSequence) "I!H                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444", "H!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H", "###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ahi!h4#4#################################################java.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###HHI!H444444444444444444444444444444444444444..#444444444444hi!H!ih!ih!ih", "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa4444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAA4AAAAAAAAA4444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "##################### ####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..." + "'", str2, "4444444...");
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                     ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "       ccc[[[        ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hhhHHI4H444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 37, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#################################################", (java.lang.CharSequence) "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     ", "      i!hi!hi!       ", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#####################4444hi!444####################", "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444####################" + "'", str2, "#####################4444hi!444####################");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhi!hi!hi!hhi!hi!hi", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "   444444444444hi!hi!hi!h4444444444444    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444hhi!h444444444444444444444444444444444444444...", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 80, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444...", "#4#################################################", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa" + "'", str1, "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("   #H   ##", "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   #H   ##" + "'", str2, "   #H   ##");
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) " HI!HI", (java.lang.CharSequence) "#444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                      h!ih!ih!ih                     ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h#############", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44hi!hi!hi!hclass [Ljava.lang.Strin", "!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!hclass [Ljava.lang.Strin" + "'", str2, "44hi!hi!hi!hclass [Ljava.lang.Strin");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   " + "'", str2, "4444444444444444444444444444444444444444444444444                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444##########################################################################################", "4444444444444444444444444444444444444444444444444                                                                 hhi!hi!hi!hhi!hi!hi", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ##########################################################################################" + "'", str3, "          ##########################################################################################");
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444444444...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###HHI!H444444444444444444444444444444444444444...", "hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444..." + "'", str3, "444444444444444444444444444444444444444...");
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!h" + "'", str7, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44" + "'", str2, "   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44");
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("   ", "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("###hhi!h444444444444444444444444", "#####HHI!HI!H#####HHI!HI!H", 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!h444444444444444444444444" + "'", str3, "###hhi!h444444444444444444444444");
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                      hi!hi!hi!ha...", "44hi!hi!hi!h");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hhi!hi!hi!hhi!hi!hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...!H4444444444444");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, ' ');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "   ");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h", '4');
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("#", strArray25, strArray29);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray29);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.stripAll(strArray29, "4444444...44hi!hi!hi!h4444444444444");
        boolean boolean34 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                      h!ih!ih!ih                     ", (java.lang.CharSequence[]) strArray29);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", strArray19, strArray29);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H", strArray15, strArray19);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", strArray9, strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                      hi!hi!hi!ha..." + "'", str11, "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#" + "'", str30, "#");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str35, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H" + "'", str36, "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str37, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI#########", (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("######################", "44444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!hi!hi!h     ", (java.lang.CharSequence) "#               #");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                               h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", (java.lang.CharSequence) "....String;class [Ljava.lang....##                                ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "##################### ####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                   " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!H444444444444444444444444444444444444444...", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", charSequence2, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44###HHI4...#####################4444hi!444#####################44", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaa...", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!aaaaaaaa444444444444444aaaaaaaaahi!", (java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!H444444444444444444444444444444444444444...", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!H444444444444444444444444444444444444444..." + "'", str4, "HHI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#####################4444hi!444####################", 81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                         #4#################################################4", 10, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                " + "'", str3, "                ");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                          ", 100, " ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI                                                 hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#H" + "'", str3, "                           ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#H");
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH" + "'", str1, "H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444..AAAAAAAA44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!444#####################44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#', '#' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "          44hi!hi!hi!h", (java.lang.CharSequence) "       ccc[[[        ", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444       444...        ", (java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!H444444444444444444444444444444444444444..", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!H444444444444444444444444444444444444444.." + "'", str3, "HI!H444444444444444444444444444444444444444..");
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444444444444h!ih!ih!ih44444444444", 319);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444h!ih!ih!ih44444444444" + "'", str2, "444444444444h!ih!ih!ih44444444444");
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("....String;class [Ljava.lang....", 181, "HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....String;class [Ljava.lang....HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HHHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444" + "'", str3, "....String;class [Ljava.lang....HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HHHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi" + "'", str1, "hi!hi");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...4444444444444444444444444ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###", "###HHI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "...          ########", (java.lang.CharSequence) "h#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HHI!444444444444444444444444444444444444444HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!444444444444444444444444444444444444444hhi!" + "'", str1, "hhi!444444444444444444444444444444444444444hhi!");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...###hhi!h                                       ..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hi!h444hi!hi!hi!h44444444444444444..h", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4..h" + "'", str2, "4..h");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA44444444", "#444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA44444444" + "'", str2, "4444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA44444444");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "              ", (java.lang.CharSequence) "44444444444444444444444...", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "###HHI!HI!HI...", (java.lang.CharSequence) "...###hhi!h444444444444444444444444444444444444444...", 195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hhi!h...", 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#               #", "###############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                               ###HHI!H44444444444444444444444444444444", 899, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                               ###HHI!H44444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                               ###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4", "                                                                                                                                                                                                                        ", 50);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                               ###hhi!h444444444444444444444444444444444444444...", "hi", 53);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                 hhi!hi!hi!hhi!hi!hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 hhi!hi!hi!hhi!hi!hi" + "'", str2, "                                                                                 hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                     ", "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "444444444444444");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!hi!h4444444444444444444444444444                                               h");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                               ###hhi!h44444444444444444444444444444444", (java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444                               ", "#####################4444hi!444#####################", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", "aaaaaaaa          444444444444444          aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str2, "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
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
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#               #");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#", "                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#" + "'", str2, "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#");
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444", 12, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444" + "'", str3, "444444444444444444444");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444" + "'", str1, "444444444444444");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "....String;class [Ljava.lang....##", (java.lang.CharSequence) "....String;class [Ljava.lang....##                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#h##", 31, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa#h##aaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaa#h##aaaaaaaaaaaaaa");
    }
}

