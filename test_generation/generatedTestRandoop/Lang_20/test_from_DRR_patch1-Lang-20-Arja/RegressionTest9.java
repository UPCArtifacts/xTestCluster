import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                               h", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaaaaaaaaa444444444444444aaaaa" + "'", str2, "!ihaaaaaaaaa444444444444444aaaaa");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "ia!ahia!ahia!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               ", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", (int) (short) 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444h!ihh###                                               ", ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("###HHI!H44444444444444444444444444444444", strArray6, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI", strArray6, strArray14);
        java.lang.String[] strArray16 = null;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", strArray6, strArray16);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str10, "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!HI" + "'", str15, "HI!HI");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str17, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("######       ccc[[[", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###h              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str1, "ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH" + "'", str1, "h#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", 34, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444aaaaaaaa4aaaaaaaaa44444444444444444444444" + "'", str3, "444444aaaaaaaa4aaaaaaaaa44444444444444444444444");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###HHI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!HI!HI..." + "'", str1, "###HHI!HI!HI...");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "##################### ####################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################HI!HI!H444444444444444444444444444444444444444..." + "'", str1, "###################################################HI!HI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "4444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi", (java.lang.CharSequence) "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("###HHI!H444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h444444444444444444444444" + "'", str1, "###hhi!h444444444444444444444444");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hi!h444444444444444444444444444444444444444..h", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", (java.lang.CharSequence) "a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("#", strArray6, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          hi!hi!hi!h");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("...                                       ###HHI!H444444444444444444444444444444444444444...", strArray10, strArray14);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                               ###hhi!h44444444444444444444444444444444");
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("444!ih4444", strArray14, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 91 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#" + "'", str11, "#");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "...                                       ###HHI!H444444444444444444444444444444444444444..." + "'", str15, "...                                       ###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "truea1a0a100a100a100");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###", "                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ##########                   hi!hi!hi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str1, "...44aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################" + "'", str1, "##########################################################################################");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i4!4hi4!4hi4!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i4!4hi4!4hi4!" + "'", str2, "i4!4hi4!4hi4!");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     ", "h#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###HHI4...", (java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HHI!HI!HI!HHI!HI!HI!HHI!HI!", "###############################################hi!hi!h444444444444444444444444444444444444444...                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!" + "'", str2, "HHI!HI!HI!HHI!HI!HI!HHI!HI!");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!H", (java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444############## #", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444############## #" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444############## #");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          44hi!hi!hi!h", "", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                 hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                 hhi!hi!hi!hhi!hi!hi" + "'", str1, "                                                                                 hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc" + "'", str1, "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          44hi!hi!hi!h", (java.lang.CharSequence[]) strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 871 + "'", int10 == 871);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444#######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444#######################################################################" + "'", str1, "4444444444#######################################################################");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "lcajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnajL[ ssaval.alc;gnirtS.gnaC[ ss", (java.lang.CharSequence) "HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!H444444444444444444444444444444444444444...", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!H444444444444444444444444444444444444444..." + "'", str2, "HI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "44hi!hi!hi!hclass [Ljava.lang.Strin", (java.lang.CharSequence) "                  ... ###hhi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa", "H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444..AAAAAAAA44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H" + "'", str2, "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "h!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444", "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               ###h######hhhi###h!###hh###" + "'", str2, "                                               ###h######hhhi###h!###hh###");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "#####");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#4#################################################", (java.lang.CharSequence) "###HHI!H444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHI!HI!HI!HHI!HI!HI!HHI!HI#########", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HHI!HI!HI!HHI!HI!HI!HHI!HI######### " + "'", str2, " HHI!HI!HI!HHI!HI!HI!HHI!HI######### ");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####################       ####################", "###HHI!H444444...", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("... ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "                               ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!H444444444444444444444444444444444444444...", "#####################4444hi!444#####################", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444444444444" + "'", str8, "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "###############", (java.lang.CharSequence) "#!4hi4!4hi4!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi!h444hi!hi!hi!h44444444444444444..h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "444444444444hi!H!ih!ih!ih", (java.lang.CharSequence) "444444444444444                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH#IH#IHH#IH#IH#IHH#IH#IH#IHH" + "'", str1, "IH#IH#IHH#IH#IH#IHH#IH#IH#IHH");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "H!ih!ih!ih", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 ", "I!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444#####################44" + "'", str1, "#####################4444hi!444#####################44");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!hi!h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", "...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH", (java.lang.CharSequence) "4444444444444h!ih!ih!ih444444444444", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#####HHI!HI!H#####HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "###hhi!h444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "H!ih!ih!ihaaaaaaaa444444444444444aa", (java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 5, "444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444.." + "'", str3, "444..");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!", 317);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             hi!                                                                                                                                                             " + "'", str2, "                                                                                                                                                             hi!                                                                                                                                                             ");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "    ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###############HI!HI!HI!H444444444444444444444444444444444444444..###############", "4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!HI!HITRUEA1A0A100A100A100", "                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HITRUEA1A0A100A100A100" + "'", str2, "!HI!HITRUEA1A0A100A100A100");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###hhi!h444444444444444444444444444444444444444...", "                                                                                          hi!hi!hi!h");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 319);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!hi!h4...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444############## #", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..", 81);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("####################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################" + "'", str1, "####################################################################################################");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!HI!HITRUEA1A0A100A100A100", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###hhi4hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi4hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "###hhi4hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "#               #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "444444444444444444444", (java.lang.CharSequence) "                                                                      i!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444############## #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444############## #" + "'", str1, "4444444444############## #");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                               ###4!4444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###4!4444444444444444444444444444444444444444..." + "'", str1, "###4!4444444444444444444444444444444444444444...");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hhi!hi!hi!hhi!h########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####################4444hi!444#####################", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                               ###hhi!h44444444444444444444444444444444##########", charArray11);
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
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc" + "'", str1, ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!" + "'", str1, "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#####           ######");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi", "###h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi" + "'", str2, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44" + "'", str1, "HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44HI!444#####################44");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "444hhi!h4444444444...44444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####################       ####################", "... ###hhi!h4444444444444444444444444444444...", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                 ", (java.lang.CharSequence) "                  ... ###hhi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "    ############################", (int) (short) 0, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h4444444444444" + "'", str1, "hi!hi!hi!h4444444444444");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        char[] charArray4 = new char[] { ' ', '4', ' ', 'a' };
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a' };
        char[] charArray14 = new char[] { ' ', '4', ' ', 'a' };
        char[] charArray19 = new char[] { ' ', '4', ' ', 'a' };
        char[] charArray24 = new char[] { ' ', '4', ' ', 'a' };
        char[][] charArray25 = new char[][] { charArray4, charArray9, charArray14, charArray19, charArray24 };
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(charArray25);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " 4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " 4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , 4,  , a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a]");
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "....String;class [Ljava.lang....", 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", "###hhi!h444444444444444444444444444444444444444...", "444444444444444444444444444444444444444...", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc" + "'", str4, "C[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "###hhi!h444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###HHI!H44444444444444444444444444444444", 7, "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str3, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##################### ####################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", 195, 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!h###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  HI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", str4, "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!h###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  HI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#####################4444hi!444###HHI!H44444444", "HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444###HHI!H44444444" + "'", str2, "#####################4444hi!444###HHI!H44444444");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###h");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray11, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("#", strArray23, strArray27);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray27);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.stripAll(strArray27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("H!ih!ih!ih", strArray18, strArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEach("444!ih4444", strArray3, strArray18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!h" + "'", str15, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#" + "'", str28, "#");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H!ih!ih!ih" + "'", str31, "H!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "444!ih4444" + "'", str32, "444!ih4444");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "                                                                                                                                                                                                              ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                          ", 53, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("############################################################################################", "###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################" + "'", str2, "############################################################################################");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", (java.lang.CharSequence) "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444hhi!h444444444444444444444444444444444444444...", 24, 81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444..." + "'", str3, "44444444444444444444444...");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444" + "'", str3, "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ihaaaaaaaaa444444444444444aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("###hhi!h444444444444444444444444444444444444444..", "Hi!hi!h444444444444444444444444444444444444444...", (int) 'a');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       444...        ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444h!ihh###" + "'", str1, "44444444444444444444444444444444h!ihh###");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...!HHI!HI!HI!HHI!HI!HI###...", "!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HAAAAAAAA444444444444444AAAAAAAAAHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444..AAAAAAAA44444444", "4444hi!444", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444" + "'", str1, "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("truea1a0a100a100a100", (int) (byte) 1, "                                    HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "truea1a0a100a100a100" + "'", str3, "truea1a0a100a100a100");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                      h!ih!ih!ih                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444.." + "'", str1, "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("##########################################################################################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################" + "'", str2, "##########################################################################################");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(".", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", (java.lang.CharSequence) "###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!H", "h#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI", (java.lang.CharSequence) "!HI!HITRUEA1A0A100A100A100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", 18, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hhi!hi!hi" + "'", str3, "i!hi!hhi!hi!hi");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("TRUEA1A0A100A100A100", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI4!4HI4!4HI4!4H44444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI4!4HI4!4HI4!4H44444444444444444444444444444444444444444..." + "'", str1, "hI4!4HI4!4HI4!4H44444444444444444444444444444444444444444...");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str1, "#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str1, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                 hhi!hi!hi!hhi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44hi!hi!hi!hclass [Ljava.lang.Strin", (-1), 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###############HI!HI!HI!H444444444444444444444444444444444444444..###############", "444...                                                                                    ", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "#####################4444hi!444####################");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 ", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!hi!hclass [Ljava.lang.Strin", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hi!hi!h...", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", "hhi!h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", "hi!hi!hi!h...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI", (java.lang.CharSequence) "..444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("###hhi!h", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4", (java.lang.CharSequence) "I!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...", 924, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 10);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "   ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!h###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  HI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", "   hi!hi!hi!h    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaah" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HHI!H...", "              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              " + "'", str2, "              ");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#####HHI!HI!H#####HHI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!HI!H444444444444444444444444444444444444444", (java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("truea1a0a100a100a100", 0, "HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "truea1a0a100a100a100" + "'", str3, "truea1a0a100a100a100");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                    aaaaaaaaa444444444444444aaaaaaaa" + "'", str1, "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("    444444444444     ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    444444444444     " + "'", str3, "    444444444444     ");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", "HHI!HI!HI!HHI!HI!HI!HHI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444" + "'", str2, "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "       ccc[[[        ", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", strArray3, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str14, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "      ########", (java.lang.CharSequence) "###################################################HI!HI!H444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi", (java.lang.CharSequence) "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaa", "hhi!h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                               ", (int) 'a', 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("#", strArray18, strArray22);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray22);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray22);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("H!ih!ih!ih", strArray13, strArray25);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                      hi!hi!hi!ha...", "44hi!hi!hi!h");
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.stripAll(strArray29, "hhi!hi!hi!hhi!hi!hi");
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.stripAll(strArray29, "...!H4444444444444");
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", strArray25, strArray33);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!h" + "'", str10, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#" + "'", str23, "#");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H!ih!ih!ih" + "'", str26, "H!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin" + "'", str34, "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                     #####################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!h###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  HI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!h###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  HI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!h###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  HI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("##################### ####################", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############" + "'", str2, "############");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                   hi!hi!h444444444444444444444444444444444444444...", "#", (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "444..", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", "###HHI4...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444..." + "'", str1, "444...");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "############", (java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######" + "'", str1, "######");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("   #h   ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   #H   ##" + "'", str1, "   #H   ##");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       444...        ", 89, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#444444444444444444444...", "4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                            ", "truea1a0a100a100a100", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444...", 0, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444..." + "'", str3, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################" + "'", str1, "#################################################");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#               #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "i!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", (java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                      h!ih!ih!ih...", (java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!H444444444444444444444444444444444444444...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", (int) (short) 0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ", (-1), 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                            ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HHI!HI!HI!HHI!HI!HI!HHI!HI#########", "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", "HI!H!IH!IH!IH", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI#########" + "'", str4, "HHI!HI!HI!HHI!HI!HI!HHI!HI#########");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!ih!ih!ih" + "'", str1, "H!ih!ih!ih");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHI!H444444444444444444444444444444444444444...", "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444444444444", 47, 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "####################################################################################hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hhh###hhi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444", (java.lang.CharSequence) "HI!HI!HI!H", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!444444444444444444444444444444444444444HHI!", "HI!HI!HI!H4444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444hhi!h444444444444444444444444444444444444444...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H" + "'", str3, "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "        ", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha.." + "'", str1, "4444   444                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..                                                                                      hi!hi!hi!ha..");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "######       ccc[[[", 40, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("###h", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444", strArray3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "", 0, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str7, "444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###############HI!HI!HI!H444444444444444444444444444444444444444..###############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############HI!HI!HI!H444444444444444444444444444444444444444..###############" + "'", str1, "###############HI!HI!HI!H444444444444444444444444444444444444444..###############");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444                                                                    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..", (java.lang.CharSequence) "hi!hi!h4444444444444444444444444444                                               h", 914);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 114 + "'", int3 == 114);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     " + "'", str1, "                                                     ");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44hi!hi!hi!h4444444444444", "44444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                    aaaaaaaaa444444444444444aaaaaaaa", (java.lang.CharSequence) "#4#################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################################", "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444hi!444");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#####################       ####################", (java.lang.CharSequence) "##################### ####################", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "#################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "... ###hhi!h4444444444444444444444444444444...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaa4aaaaaaaaa", "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444.." + "'", str1, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "44444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aa ", "", 53);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str1, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray8, strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444hi!444", strArray12, strArray16);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int23 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray22);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray22, strArray25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("   444444444444hi!hi!hi!h4444444444444    ", strArray12, strArray22);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '4');
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444h!ih!ih!ih444444444444444444444", "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", strArray12, strArray32);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4444hi!444" + "'", str18, "4444hi!444");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!h" + "'", str26, "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "   444444444444hi!hi!hi!h4444444444444    " + "'", str27, "   444444444444hi!hi!hi!h4444444444444    ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#" + "'", str29, "#");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str33, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###hhi!h444444444444444444444444444444444444444..." + "'", str1, "...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!H444444444444444444444444444444444444444...", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                            ", (java.lang.CharSequence) "                                               ###h######hhhi###h!###hh###", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                               ###4!4444444444444444444444444444444444444444...", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                               ###4!4444444444444444444444444444444444444444..." + "'", charSequence2, "                                               ###4!4444444444444444444444444444444444444444...");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H!IH!IH!IH" + "'", str1, "HI!H!IH!IH!IH");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "H!ih!ih!ih", (java.lang.CharSequence) "                                               h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###HHI!H444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!H444444444444444444444444" + "'", str1, "###HHI!H444444444444444444444444");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str1, "!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih!ih" + "'", str1, "h!ih!ih!ih");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####################4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "hi!hi!hi!h4444444444444###########################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "###############################################hi!hi!h444444444444444444444444444444444444444...", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!ha...", 871, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444############## #", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaah", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaah" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                   ... ###hhi!h444444444444444444444444444444444444444...                   ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                     ", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     " + "'", str3, "                                                     ");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                      hi!hi!hi!ha..", "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!HI!HI!H4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "              ############################", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444.....");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("###h              ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###h              " + "'", str2, "###h              ");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str2, "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("############################################################################################", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####################################################################################################", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############" + "'", str2, "############");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                               4###4hhi4!4h444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "   h      h      h      h      h      h      h      h      h      h      h      h   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                               4###4hhi4!4h444444444444444444444444444444444", "4h   44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                   ", "                                               ###hhi!h44444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###", (java.lang.CharSequence) "...                44hi!hi!hi!h        ...", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i4!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i4!4hi4!4hi4!" + "'", str1, "i4!4hi4!4hi4!");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H", "", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h#44...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHI#HI#HI#HHI#HI#HI#HHI#HI#HI", "hi!hi!h4444444444444444444444444444                                               h", "###h              ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("############", "                  ... ###HHI!H444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############" + "'", str2, "############");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44hi!hi!hi!h4444444444444", "HI4!4HI4!4HI4!4H44444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!h4444444444444" + "'", str2, "44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!H444444444444444444444444444444444444444", 0, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!H444444444444444444444444444444444444444" + "'", str3, "HI!HI!H444444444444444444444444444444444444444");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                      hi!hi!hi!ha..", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h", "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "#4#################################################4", 29, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                          " + "'", str4, "                                                                                          ");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "                                                                      i!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", 0, "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi" + "'", str3, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                             hi!                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                             hi!                                                                                                                                                             " + "'", str1, "                                                                                                                                                             hi!                                                                                                                                                             ");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############################################hi!hi!h444444444444444444444444444444444444444...", "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("######################", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "######################" + "'", str9, "######################");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("444444444444444444444444444444444444444...", "TRUEA1A0A100A100A100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUEA1A0A100A100A100" + "'", str2, "TRUEA1A0A100A100A100");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                    HI!HI!HI!H", "#444444444444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###########################", "I!H                        ", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                   hi!hi!hi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "44hi!hi!hi!h", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("H#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH", 47, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH" + "'", str3, "H#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH" + "'", str2, "!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "   h      h      h      h      h      h      h      h      h      h      h      h                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("##################### ####################", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!" + "'", str2, "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!");
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!aaaaaaaa444444444444444aaaaaaaaahi!", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaa444444444444444aaaaaaaaahi!" + "'", str3, "hi!aaaaaaaa444444444444444aaaaaaaaahi!");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh" + "'", str1, "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###############################################hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                               h", (java.lang.CharSequence) "...               ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                     #####################################", "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", 90, 47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str4, "                                               h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("   hi!hi!hi!h    ", "###HHI!H444444444444444444444444444444444444444..#444444444444hi!H!ih!ih!ih", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!hi!h    " + "'", str3, "   hi!hi!hi!h    ");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "       444...        ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...###HHI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("#####################4444HI!444###hhi!h44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "4444444444444444444444444...!H4444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "###############", (java.lang.CharSequence) "   #h   ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHI!444444444444444444444444444444444444444HHI!", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!444444444444444444444444444444444444444HHI!" + "'", str2, "HHI!444444444444444444444444444444444444444HHI!");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("###HHI!H44444444444444444444444444444444", "                                                                    aaaaaaaa444444444444444aaaaaaaaa", "44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 29, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444h!ih!ih!ih44444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("######################", "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################" + "'", str2, "######################");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!", (java.lang.CharSequence) " HI!HI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!" + "'", charSequence2, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("   hi!hi!hi!h    ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "aaaaaaaa4aaaaaaaaa", "... ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I!H", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444h!ih!ih!ih444444444444", "                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaa444444444444444aaaaaaaaa", 1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str3, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("#", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "4444444...44hi!hi!hi!h4444444444444");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444                                                                    ", "   ", 15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hhi!hi!hi!hhi!h########", strArray13, strArray17);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!h########" + "'", str18, "hi!hi!hi!hhi!hi!hi!hhi!h########");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!" + "'", str1, "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444", "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!", (java.lang.CharSequence) "i4!4hi4!4hi4!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###h");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh", (java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 92, 41);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444.." + "'", str2, "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!HI!H444444444444444444444444444444444444444", "###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaa444444444444444aaaaaaaaa", 39, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444..." + "'", str1, "4444444...");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!h4...", (java.lang.CharSequence) "HHI!H...", 914);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                     ", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                   hi!hi!hi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   hi!hi!hi!h444444444444444444444444444444444444444...                   " + "'", str1, "                   hi!hi!hi!h444444444444444444444444444444444444444...                   ");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444h!ih!ih!ih44");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 0, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!hi!hi!ha...", (java.lang.CharSequence) "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###HHI!H444444444444444444444444444444444444444..", 0, 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI!H444444444444444444444444444444444444444.." + "'", str3, "###HHI!H444444444444444444444444444444444444444..");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       444...        ", "         44hi!hi!hi!hclass [Ljava.lang.Strin         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI!HI!H4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444444                               ", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444                               " + "'", str2, "444444444444444                               ");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                 hhi!hi!hi!hhi!hi!hi", "4444444444444444444444444444444444444444444444444", (int) (short) -1, 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444                                                                 hhi!hi!hi!hhi!hi!hi" + "'", str4, "4444444444444444444444444444444444444444444444444                                                                 hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          ", "##########################", 99);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                               h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hihihihihihihihihihi", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihi" + "'", str2, "hihihihihihihihihihi");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi4444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!H44444444444444444444444444444444444444...!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...4444444444444444444444444ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###" + "'", str1, "!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...4444444444444444444444444ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###");
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!" + "'", str1, "i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!...i!hi!hi!");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "H#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!h     ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h     " + "'", str2, "hi!hi!hi!h     ");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########################################################################################", 39, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h#44...", (java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" HI!HI", "hihih       444...        hihihi", 49, 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " HI!HIhihih       444...        hihihi" + "'", str4, " HI!HIhihih       444...        hihihi");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 4, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "hi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                    ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################" + "'", str3, "####################################################################");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" HHI!HI!HI!HHI!HI!HI!HHI!HI######### ", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", 25);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4444444444444444444444444444444..AAAAAAAA44444444", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA44444444" + "'", str2, "4444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA444444444444444444444444444444444444444..AAAAAAAA44444444");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               ", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", (int) (short) 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444h!ihh###                                               ", ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("###HHI!H44444444444444444444444444444444", strArray5, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("4444444444444h!ih!ih!ih444444444444");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI!H", strArray8, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str9, "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4444444444444h!ih!ih!ih444444444444" + "'", str13, "4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!HI!H" + "'", str14, "HI!HI!H");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                      h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      h!ih!ih!ih                     " + "'", str1, "                      h!ih!ih!ih                     ");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!hi!h", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 25, 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!h" + "'", str4, "hi!hi!hi!h");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###HHI!HI!HI...", 40, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444###HHI!HI!HI..." + "'", str3, "4444444444444444444444444###HHI!HI!HI...");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!h###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  HI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h", "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (int) (byte) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h#IHH#IH#IH#IHH#IH#IH#IHH#aaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaahi!###########AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IHAAAAAAAAA###############AAAAAAAAH#IHH#IH#IH#IHH#IH#IH#IHH#IH#IH#IH", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiH4IHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIh4ihh###" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIh4ihh###");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "###HHI!HI!HI...", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "00a100a100");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...                44hi!hi!hi!h        ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hhi!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!h..." + "'", str1, "hhi!h...");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444", (java.lang.CharSequence) "HHI!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   h      h      h      h      h      h      h      h      h      h      h      h                ", "#               #", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44hi!hi!hi!hclass [Ljava.lang.Strin", "###hhi!h444444444444444444444444444444444444444.....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!hclass [Ljava.lang.Strin" + "'", str2, "44hi!hi!hi!hclass [Ljava.lang.Strin");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######" + "'", str1, "######");
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", "#####           ######44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###44444444444444444444444444444444h!ihh###4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "00a100a100", (java.lang.CharSequence) "444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI" + "'", str1, "hI!HI");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444.." + "'", str1, "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "   h      h      h      h      h      h      h      h      h      h      h      h                ", (java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hhh!ihhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...44444444444444444444444444444444444444H!...4444444444444444444444444ih!ih!ihh!ih!ih!ihh!ih!ih!ihh###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4", (java.lang.CharSequence) "aaaaaaaa4aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!h", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h" + "'", str2, "hi!hi!hi!h");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5, strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 25, 10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!444#####################44", (java.lang.CharSequence[]) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "aaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#####################4444hi!444", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444hi!444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaa444444444444444aaaaaaaaa", "###h", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH#IH#IHH#IH#IH#IHH#IH#IH#IHH", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 9 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str5, "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "Hi!hi!h44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!hi!h444444444444444444444444444444444444444..h", "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444..h" + "'", str2, "hi!hi!h444444444444444444444444444444444444444..h");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h444444444444444hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi", "                                    HI!HI!HI!H", "                                                                                                                                                             hi!                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi" + "'", str3, "hi!hi");
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!H444444444444444444444444444444444444444...", "", "H!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IHAAAAAAAAA444444444444444AAAAAAAAH!IHH!IH!IH!IHH!IH!IH!IHH!IH!IH!IH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                        ########", (java.lang.CharSequence) "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444h!ih!ih!ih444444444444", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh#", 1, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "hi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#####           ######", "... ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####           ######" + "'", str2, "#####           ######");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aa ", (java.lang.CharSequence) "###HHI!H444444...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aa " + "'", charSequence2, "aa ");
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4');
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###h", (java.lang.CharSequence[]) strArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, ' ');
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, 'a');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#" + "'", str18, "#");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#" + "'", str21, "#");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "######", (java.lang.CharSequence) "!h44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", (java.lang.CharSequence) "########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               ###hhi!h44444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444", 14, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 914);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaahhi!h...", " ahi!h44hi!hi!hi!hclass [Ljava.lang.StrinaaaaaaaaaaaaaaaaaaaaaaHHI#HI#HI#HHI#HI#HI#HHI#HI#HI                                                 hi!hi!h444444444444444444444444444444444444444...", "    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!H", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#4#################################################4", 317);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                         #4#################################################4" + "'", str2, "                                                                                                                                                                                                                                                                         #4#################################################4");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hihih       444...        hihihi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###hhi!h44444444444444444444444444444444##########", "..444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###...444444444444444444444444444444444444444h!ihh###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h44444444444444444444444444444444##########" + "'", str2, "###hhi!h44444444444444444444444444444444##########");
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray6, strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "", (int) 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, " ");
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (java.lang.CharSequence[]) strArray18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                  44hi!hi!hi!h                   ", strArray12, strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str13, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                  44hi!hi!hi!h                   " + "'", str22, "                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "###" + "'", str24, "###");
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..", "4444hi!444###HHI!H44444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444.." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..hi!hi!hi!h444444444444444444444444444444444444444..", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###hhi!h444444444444444444444444444444444444444.....", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H      ", "HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHhhi#h444444444444444444444444444444444444444....." + "'", str3, "HHHhhi#h444444444444444444444444444444444444444.....");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "H!ih!ih!ihaaaaaaaa444444444444444aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444..." + "'", str1, "444444444444444444444...");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...4444...", "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444..." + "'", str2, "...4444...");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                               ###h######hhhi###h!###hh###h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###h######hhhi###h!###hh###h44444444444444444444444444444444" + "'", str1, "###h######hhhi###h!###hh###h44444444444444444444444444444444");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H      ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "      ########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444" + "'", str2, "444444444444444444444444aaaaaaaa444444444444444    aahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44   4h   44", "   hi!hi!hi!h    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h     ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "!HI!HITRUEA1A0A100A100A100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!h44hi!hi!hi!hclass [Ljava.lang.Strin", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 18 + "'", int14 == 18);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#!4hi4!4hi4!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444", "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444hi!444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#!4hi4!4hi4!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI" + "'", str5, "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444hi!H!ih!ih!ih", 48, "######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########444444444444hi!H!ih!ih!ih############" + "'", str3, "###########444444444444hi!H!ih!ih!ih############");
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaa444444444444444aaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "          ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa          444444444444444          aaaaaaaaa" + "'", str3, "aaaaaaaa          444444444444444          aaaaaaaaa");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                  44hi!hi!hi!h                   ", 92);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h444444444444444444444444444444444444444...", strArray7, strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray7);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "###h" + "'", str17, "###h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..." + "'", str18, "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                   ", "...4444...", 0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("i!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444h!ih!ih!ih444444444444", "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#', '#' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hhi!h444444444444444444444444444444444444444...                          ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "....String;class [Ljava.lang....##", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" HI!HI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!HI" + "'", str2, " HI!HI");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 10, 0);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...                                       ###HHI!H444444444444444444444444444444444444444...", (java.lang.CharSequence) "44hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                  ... ###hhi!h444444444444444444444444444444444444444...                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "h!ih!ih!ih", (java.lang.CharSequence) "#####################4444hi!444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                        ", "                      h!ih!ih!ih...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("H", "##########", "444..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi!hi!hi!hhi!hi!hi!hhi!h########", 24, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaa               aaaaaaaaa", "HI!HI!HI!H444444444444444444444444444444444444444...", "                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa               aaaaaaaaa" + "'", str3, "aaaaaaaa               aaaaaaaaa");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "44444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("   444444444444hi!hi!hi!h4444444444444    ", "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   444444444444hi!hi!hi!h4444444444444    " + "'", str2, "   444444444444hi!hi!hi!h4444444444444    ");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "#################444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "############################################################################################", (java.lang.CharSequence) "                                                                      i!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444", (java.lang.CharSequence) "#", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "                                        44hi!hi!hi!h                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray2, strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI###################################################hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi", "4444444444##########################################################################################", "h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   hhhi!hi" + "'", str3, "   hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   hhhi!hi");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HHI!HI!HI!HHI!HI!HI!HHI!HI###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                 ", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#####HHI!HI!H#####HHI!HI!H");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####HHI!HI!H#####HHI!HI!H" + "'", str3, "#####HHI!HI!H#####HHI!HI!H");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("a44...", "IH#IH#IHH#IH#IH#IHH#IH#IH#IHH", 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a44..." + "'", str3, "a44...");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!h444444444444444444444444444444444444444.." + "'", str1, "hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HI!HI!HI!H44444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H44444444444" + "'", str2, "HI!HI!HI!H44444444444");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444!ih4444#####################", (java.lang.CharSequence) "444hhi!h4444444444...44444444...", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", (java.lang.CharSequence) "#################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444aaaaaaaa4aaaaaaaaa44444444444444444444444", "hi!hi!hi!hhi!hi!hi!hhi!h########", "                          hhi!h444444444444444444444444444444444444444...                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!h4444444444444444444444444444                                               h" + "'", str1, "hi!hi!h4444444444444444444444444444                                               h");
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                    aaaaaaaaa444444444444444aaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaa4aaaaaaaaa", "HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa4aaaaaaaaa" + "'", str2, "aaaaaaaa4aaaaaaaaa");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#', '#' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444..", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###H" + "'", str1, "###H");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444aaaaaaaa4aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

