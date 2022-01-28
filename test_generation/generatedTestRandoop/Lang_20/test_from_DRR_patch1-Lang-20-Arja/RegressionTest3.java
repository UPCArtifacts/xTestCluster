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
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("    ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                               ", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               " + "'", str2, "                                               ");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                                          HI!HI!HI!H", (java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444..", (java.lang.CharSequence) "I", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", 25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!ha...", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" ", "4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444...44hi!hi!hi!h4444444444444", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...44hi!hi!hi!h4444444444444" + "'", str2, "4444444...44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#####################4444HI!444#####################44", "###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!444#####################44" + "'", str2, "HI!444#####################44");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h!ih!ih!ih", "...ava.lang.String;class [C", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("###################################################hi!hi!h444444444444444444444444444444444444444...", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "###################################################hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444...44hi!hi!hi!h4444444444444", (int) (byte) 0, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4..." + "'", str3, "4...");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44hi!hi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!", 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44hi!hi!hi!h" + "'", str4, "44hi!hi!hi!h");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", (java.lang.CharSequence) "                                                                    aaaaaaaa444444444444444aaaaaaaaa", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        char[][] charArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(charArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "        ", (java.lang.CharSequence) "                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###HHI!H444444444444444444444444444444444444444...", "###h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "Hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", (java.lang.CharSequence) "444hhi!h4444444444...44444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444                               ", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444          " + "'", str2, "444444444444444          ");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#444444444444444444444..." + "'", str2, "#444444444444444444444...");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!hhi!hi!hi" + "'", str1, "hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "444444444444444                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "aaaaaaaa               aaaaaaaaa", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                               ", "                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     " + "'", str2, "                                                     ");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "h!ih!ih!ih                     ", 0, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("    ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444h!ih!ih!ih444444444444", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", str4, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444", 53, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", (java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", charSequence2, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!", (int) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###h", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "444");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###h" + "'", str4, "###h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###h" + "'", str6, "###h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#444444444444444444444...", "4...", 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#444444444444444444444..." + "'", str3, "#444444444444444444444...");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("        ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", (java.lang.CharSequence) "       444...        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44hi!hi!hi!hclass [Ljava.lang.Strin", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         44hi!hi!hi!hclass [Ljava.lang.Strin         " + "'", str2, "         44hi!hi!hi!hclass [Ljava.lang.Strin         ");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!h4444444444444444444444444444                                               h", "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih44", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence) "###H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444#####################44" + "'", str1, "#####################4444hi!444#####################44");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h" + "'", str1, "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###HHI!H444444444444444444444444444444444444444...", "                                    HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H444444444444444444444444444444444444444..." + "'", str2, "###HHI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444...", "hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 0, "4444   444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str3, "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h", (java.lang.CharSequence) "                     ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                     ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444..", "hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444.." + "'", str2, "4444444444444444444444444444444..");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!" + "'", str2, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!h" + "'", str7, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!ih!ih!ih" + "'", str1, "H!ih!ih!ih");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                          HI!HI!HI!H", "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          HI!HI!HI!H" + "'", str2, "                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "       444...        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...4444...", "#444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         44hi!hi!hi!hclass [Ljava.lang.Strin         ", "h!ih!ih!ih", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          ", (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "#####################4444hi!444#####################", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!H");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444444444444444444444444444444444444444444444444", (-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#####################4444hi!444#####################", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!H444444444444444444444444444444444444444...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                 hhi!hi!hi!hhi!hi!hi", "                      h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 hhi!hi!hi!hhi!hi!hi" + "'", str2, "                                                                                 hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444...", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444..." + "'", str2, "4444444444444444444...");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaa444444444444444aaaaaaaaa", "h!ih!ih!ih                     ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str4, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!H444444444444444444444444444444444444444...", (int) 'a', "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444" + "'", str3, "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#####################4444hi!444#####################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          ", "4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h", "hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str2, "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###HHI!H44444444444444444444444444444444", "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str2, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   444444444444hi!hi!hi!h4444444444444    ", "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   444444444444hi!hi!hi!h4444444444444    " + "'", str3, "   444444444444hi!hi!hi!h4444444444444    ");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", "                                                                                          hi!hi!hi!h", "                                                                                      hi!hi!hi!ha..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", (java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###h              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###h" + "'", str1, "###h");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                   ", "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaa444444444444444aaaaaaaaa", (int) (byte) 10, "h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str3, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444", "hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h!ih!ih!ih                                                                                          ", "                  44hi!hi!hi!h                   ", "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444##########################################################################################" + "'", str3, "4444444444##########################################################################################");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih" + "'", str1, "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          HI!HI!HI!H", 53, "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          HI!HI!HI!H" + "'", str3, "                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h!ih!ih!ih                                                                                          ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44hi!hi!hi!hclass [Ljava.lang.Strin", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                  ", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###h              ", 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444h!ih!ih!ih444444444444444444444", "                                    HI!HI!HI!H", "444444444444444          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str3, "4444444444444444444444h!ih!ih!ih444444444444444444444");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", charSequence2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", "   444444444444hi!hi!hi!h4444444444444    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", 31, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str1, "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "4444444...", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "                      h!ih!ih!ih                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "       444...        ", 92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "#####################4444hi!444####################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...4444...", (java.lang.CharSequence) "444444444444444                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####################4444hi!444####################", "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                               ###hhi!h444444444444444444444444444444444444444...", 25, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                       ###hhi!h444444444444444444444444444444444444444..." + "'", str3, "...                                       ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi!hi!hi!h4444444444444" + "'", str1, "444444444444hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str3, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                                                                 hhi!hi!hi!hhi!hi!hi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444   444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("h!ih!ih!ih                     ", "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence) "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###HHI!H44444444444444444444444444444444", "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("#", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################" + "'", str2, "############################################################################################");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                      hi!hi!hi!ha..", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44hi!hi!hi!h", "       444...        ", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("###h", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444", strArray3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "444444444444444                               ", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str7, "444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("H!ih!ih!ih", 25, "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444hi!H!ih!ih!ih" + "'", str3, "444444444444hi!H!ih!ih!ih");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "...                                       ###hhi!h444444444444444444444444444444444444444...", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444..", 3, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "4444444444444h!###4444444444444h!i", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hhi!hi!hi!hhi!hi!hi", "aaaaaaaa               aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444hi!H!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444HI!H!IH!IH!IH" + "'", str1, "444444444444HI!H!IH!IH!IH");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!H444444444444444444444444444444444444444...", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "H!ih!ih!ih", (java.lang.CharSequence) "                      h!ih!ih!ih                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444hi!hi!hi!h4444444444444", (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", (java.lang.CharSequence) "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          44hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!h" + "'", str1, "44hi!hi!hi!h");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", 32, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaa444444444444444aaaaaaaaahi!" + "'", str3, "hi!aaaaaaaa444444444444444aaaaaaaaahi!");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!hi!hi!", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!" + "'", str3, "i!hi!hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h!ih!ih!ih", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih" + "'", str2, "h!ih!ih!ih");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!444#####################44", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaa...", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444...!h4444444444444", "hi", "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444...!h4444444444444" + "'", str3, "4444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444", (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4...", (java.lang.CharSequence) "H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444...44hi!hi!hi!h4444444444444", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...44hi!hi!hi!h4444444444444" + "'", str2, "4444444...44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(objArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########################################################################################" + "'", str1, "4444444444##########################################################################################");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaa444444444444444aaaaaaaaa", "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "##########", (java.lang.CharSequence) "############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaa444444444444444aaaaaaaaa                                                                    ", "###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                    " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { '#', '#', '#' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                               ###hhi!h44444444444444444444444444444444", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 47 + "'", int7 == 47);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI4..." + "'", str2, "###HHI4...");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444h!ih!ih!ih44444444444", "##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444h!ih!ih!ih44444444444" + "'", str2, "444444444444h!ih!ih!ih44444444444");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...", (java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                   hi!hi!h444444444444444444444444444444444444444..h", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..h" + "'", str3, "                                                   hi!hi!h444444444444444444444444444444444444444..h");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444...!H4444444444444" + "'", str1, "4444444444444444444444444...!H4444444444444");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", 35, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                               h", (java.lang.CharSequence) "                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                                                  ", (java.lang.CharSequence) "###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "I", (java.lang.CharSequence) "#####################4444hi!444#####################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", (java.lang.CharSequence) "i!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#####################4444hi!444####################", "4444444...44hi!hi!hi!h4444444444444", "        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################       ####################" + "'", str3, "#####################       ####################");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ih!ih!ih", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "I", (java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                     ", 0, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           " + "'", str3, "                           ");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###h              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          ", 32, "444!ih4444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          " + "'", str3, "                                                                                          ");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 924 + "'", int1 == 924);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#####################4444hi!444####################", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444####################" + "'", str2, "#####################4444hi!444####################");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 319 + "'", int1 == 319);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "444hhi!h4444444444...44444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHI!H444444444444444444444444444444444444444...", "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                     ", 90, "############################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     #####################################" + "'", str3, "                                                     #####################################");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444HI!H!IH!IH!IH", (java.lang.CharSequence) "hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaa444444444444444aaaaaaaaa", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaa4aaaaaaaaa" + "'", str4, "aaaaaaaa4aaaaaaaaa");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#####################4444hi!444#####################44");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#####################4444HI!444#####################44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4", "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ih!ih!ih                     ", "aaaaaaaa4aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("H!ih!ih!ih", (-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444...!h4444444444444", "444hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444...!h4444444444444" + "'", str2, "4444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", (java.lang.CharSequence) "444444444444hi!H!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##########");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                   ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!" + "'", str1, "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                  44hi!hi!hi!h                   ", 92);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h444444444444444444444444444444444444444...", strArray7, strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray7);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!h", "###hhi!h444444444444444444444444444444444444444..", "h!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihh!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ihaaaaaaaaa444444444444444aaaaaaaah!ihh!ih!ih!ihh!ih!ih!ihh!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h" + "'", str3, "hi!hi!hi!h");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444h!ih!ih!ih444444444444444444444", 99, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "h!ih!ih!ih                                                                                          ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#444444444444444444444...", "#####################4444hi!444#####################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "    ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                     ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!hi!h444444444444444444444444444444444444444...", "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "Hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                  44hi!hi!hi!h                   ", "#####################4444hi!444#####################44", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  44hi!hi!hi!h                   " + "'", str3, "                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "#444444444444444444444...", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!", 42, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("#####################       ####################", 0, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###" + "'", str3, "###");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "444...", "          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str3, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... ###hhi!h444444444444444444444444444444444444444..." + "'", str1, "... ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...4444...", 319, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444hhi!h4444444444...44444444...", "                                               h", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hhi!h4444444444...44444444..." + "'", str3, "444hhi!h4444444444...44444444...");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "444hhi!h4444444444...44444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 8, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########" + "'", str3, "########");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...44hi!hi!hi!h4444444444444" + "'", str1, "4444444...44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                      h!ih!ih!ih                     ", (-1), "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      h!ih!ih!ih                     " + "'", str3, "                      h!ih!ih!ih                     ");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh" + "'", str1, "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!h4444444444444", 98, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h4444444444444###########################################################################" + "'", str3, "hi!hi!hi!h4444444444444###########################################################################");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence) "###HHI4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###h", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###h" + "'", str3, "###h");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (java.lang.CharSequence) "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                               ###hhi!h444444444444444444444444444444444444444...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "444444444444444444444444444444444444444444444444", (int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", (java.lang.CharSequence) "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hihihihihihihihihihi", "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihi" + "'", str2, "hihihihihihihihihihi");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaa444444444444444aaaaaaaaa", (int) 'a', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", "I");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                          ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", (java.lang.CharSequence) "444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (java.lang.CharSequence) "444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444h!ih!ih!ih444444444444", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          ", 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444..", (java.lang.CharSequence) "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 25, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 92, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "H!ih!ih!ih", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444##########################################################################################", "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("###h", "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###h" + "'", str2, "###h");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", (int) '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!" + "'", str3, "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "###HHI4...", "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444!ih4444", (java.lang.CharSequence) "... ###hhi!h444444444444444444444444444444444444444...", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", (int) (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str3, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", (java.lang.CharSequence) "#444444444444444444444...", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444!ih4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H", "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H" + "'", str2, "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("    ", "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   hi!hi!h444444444444444444444444444444444444444...", "                                                                                          ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaa               aaaaaaaaa", "###hhi!h444444444444444444444444444444444444444..", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "         44hi!hi!hi!hclass [Ljava.lang.Strin         " + "'", charSequence2, "         44hi!hi!hi!hclass [Ljava.lang.Strin         ");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H", "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!H444444444444444444444444444444444444444...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                   hi!hi!h444444444444444444444444444444444444444..h");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h" + "'", str5, "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!h" + "'", str7, "hi!hi!hi!h");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4...", (java.lang.CharSequence) "                                               h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!hhi!hi!hi" + "'", str1, "hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray12, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444..", (java.lang.CharSequence[]) strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!h4444444444444###########################################################################", strArray4, strArray16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str17, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!h4444444444444###########################################################################" + "'", str19, "hi!hi!hi!h4444444444444###########################################################################");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                               ", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   " + "'", str4, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi" + "'", str1, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("         44hi!hi!hi!hclass [Ljava.lang.Strin         ", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         44hi!hi!hi!hclass [Ljava.lang.Strin         " + "'", str3, "         44hi!hi!hi!hclass [Ljava.lang.Strin         ");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####################4444hi!444####################", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!h", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h" + "'", str3, "hi!hi!hi!h");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "#####################4444hi!444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", charSequence2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...", "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444444...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HHI#HI#HI#HHI#HI#HI#HHI#HI#HI", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444   444", 98);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str1, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "i!hi!hi!", (java.lang.CharSequence) "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444...", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!ih!ih!ih                                                                                          " + "'", str1, "H!ih!ih!ih                                                                                          ");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###HHI4...", "                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                               ###hhi!h44444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               ###hhi!h44444444444444444444444444444444" + "'", str2, "                                               ###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                      hi!hi!hi!ha..", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "###H", (java.lang.CharSequence) "###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "hi!hi!hi!ha...", 2, (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!ha..." + "'", str4, "hi!hi!hi!ha...");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("       444...        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444..." + "'", str1, "444...");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                               ", "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               " + "'", str2, "                                               ");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 31, "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaa444444444444444aaaaaaaaa                                                                    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444                                                                    " + "'", str2, "444444444444444                                                                    ");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", charArray10);
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
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444", 48, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444" + "'", str3, "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", 2, "4444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str3, "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          hi!hi!hi!h");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", 27, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444", (java.lang.CharSequence) "... ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444h!ih!ih!ih44444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 12, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...4444...", "h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444..." + "'", str2, "...4444...");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#', '#' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray13);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, int6, charArray13 };
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(objArray16, ' ', (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(objArray16, "h!ih!ih!ih", 90, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 90");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, -1, [a, a, #, #]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!ha..." + "'", str1, "hi!hi!hi!ha...");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("###H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###H" + "'", str1, "###H");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###h", "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...                                       ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!", 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (-1), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str9, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444hhi!h444444444444444444444444444444444444444...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!h..." + "'", str2, "hhi!h...");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                           ", "4444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           " + "'", str2, "                           ");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 49, "hi!hi!h4444444444444444444444444444                                               h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str3, "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          " + "'", str1, "                          ");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444...44hi!hi!hi!h4444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "444!ih4444", (java.lang.CharSequence) "                                                     #####################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444!ih4444" + "'", charSequence2, "444!ih4444");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444444HI!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444HI!H!IH!IH!IH" + "'", str1, "444444444444HI!H!IH!IH!IH");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444h!ih!ih!ih444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "444444444444h!ih!ih!ih44444444444", (java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                     ", (java.lang.CharSequence) "#####################4444HI!444#####################44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!h444444444444444444444444444444444444444..", "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444.." + "'", str2, "hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaa4aaaaaaaaa", "#####################4444hi!444####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa4aaaaaaaaa" + "'", str2, "aaaaaaaa4aaaaaaaaa");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!hi!h4444444444444###########################################################################", "444444444444444                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h4444444444444###########################################################################" + "'", str2, "hi!hi!hi!h4444444444444###########################################################################");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("############################################################################################", (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################" + "'", str3, "###########################################################################################");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh", "                                                                                 hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh" + "'", str2, "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                  ", (java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("##########", "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444..", 49, "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444..aaaaaaaa44444444" + "'", str3, "4444444444444444444444444444444..aaaaaaaa44444444");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!H" + "'", str1, "HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hhi!h...", (java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hhi!h..." + "'", charSequence2, "hhi!h...");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444...!h4444444444444" + "'", str1, "4444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4444444444", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                   hi!hi!h444444444444444444444444444444444444444..h", (int) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..h" + "'", str3, "                                                   hi!hi!h444444444444444444444444444444444444444..h");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '#' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                     ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         44hi!hi!hi!hclass [Ljava.lang.Strin         ", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", 90, "          44hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444" + "'", str3, "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", 2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H" + "'", str3, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (int) (byte) 10, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!h########" + "'", str3, "hi!hi!hi!hhi!hi!hi!hhi!h########");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ", 92, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            " + "'", str3, "                                                                                            ");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi", (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                               ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               ###hhi!h444444444444444444444444444444444444444..." + "'", str1, "                                               ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hhi!h...", "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", "HI!HI!HI!H444444444444444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!h444444444444444444444444444444444444444...", "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444h!###4444444444444h!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444h!###4444444444444h!i" + "'", str1, "4444444444444h!###4444444444444h!i");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 8, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hi!h444444444444444444444444444444444444444..", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "###", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444" + "'", str1, "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444...!h4444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                          hi!hi!hi!h");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hihihihihihihihihihi", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihihihihihihihi" + "'", str3, "hihihihihihihihihihi");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!h444444444444444444444444444444444444444...", "                                                   hi!hi!h444444444444444444444444444444444444444..h", 41);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44hi!hi!hi!h4444444444444", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444hhi!h444444444444444444444444444444444444444...", "###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!h444444444444444444444444444444444444444..." + "'", str2, "hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                           ", (java.lang.CharSequence) "4444444444444444444444444...!h4444444444444", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", 42, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444" + "'", str3, "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444...!h4444444444444" + "'", str1, "4444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444...!h4444444444444" + "'", str1, "4444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                               ", (java.lang.CharSequence) "...4444...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                               " + "'", charSequence2, "                               ");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                               ", "... ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhi!h...", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaahhi!h..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaahhi!h...");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "H!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi", (int) '4', "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi" + "'", str3, "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!" + "'", charSequence2, "AAAAAAAA444444444444444AAAAAAAAAHI!AAAAAAAA444444444444444AAAAAAAAAHI!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 10);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                               ", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                          ", "4444444444##########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          " + "'", str2, "                          ");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhi!h444444444444444444444444444444444444444...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!h4444444444444", 99, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444          ", (java.lang.CharSequence) "hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hhi!h444444444444444444444444444444444444444...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!h..." + "'", str2, "hhi!h...");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 34, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str3, "#####HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#####################4444hi!444#####################44");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444HI!H!IH!IH!IH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444" + "'", str1, "4444444444");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                     #####################################", (java.lang.CharSequence) "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###", 924);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", (java.lang.CharSequence) "                      h!ih!ih!ih                     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444...", 2, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444..." + "'", str3, "444...");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444hi!hi!hi!h4444444444444", (int) (short) 10);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!hclass [Ljava.lang.Strin" + "'", str1, "44hi!hi!hi!hclass [Ljava.lang.Strin");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444" + "'", str1, "4444444444");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h!ih!ih!ih", (java.lang.CharSequence) "44444444444444444444444444444444444", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444...", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...                                                                                    " + "'", str2, "444...                                                                                    ");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", (java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", "hi!hi!hi!h4444444444444###########################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444...", "hi!hi!h444444444444444444444444444444444444444..");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#####################4444hi!444", 47, "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444###HHI!H44444444" + "'", str3, "#####################4444hi!444###HHI!H44444444");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!", 8, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hhi!h...", "4444444444444h!ih!ih!ih444444444444", "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444", "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444" + "'", str2, "4444444444444444444444444HI!H444444444444444444444444444444444444444...44444444444444444444444444");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!..." + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                   ", "###h              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#', '#' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444...", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###h", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444!ih4444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", "   444444444444hi!hi!hi!h4444444444444    ", 47);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "4444444444444h!...444444444444444444444444444444444444444h!ih!ih!ihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444hi!H!ih!ih!ih", "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444hi!H!ih!ih!ih" + "'", str3, "444444444444hi!H!ih!ih!ih");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444                                                                    ", (java.lang.CharSequence) "                                                     #####################################", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaa444444444444444aaaaaaaaa                                                                    ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                    " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   ", (java.lang.CharSequence) "###", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", "#####################       ####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi" + "'", str2, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444##########################################################################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", 42, "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi" + "'", str3, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###h", "hi!");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "               ", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("         44hi!hi!hi!hclass [Ljava.lang.Strin         ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "         44hi!hi!hi!hclass [Ljava.lang.Strin         " + "'", str8, "         44hi!hi!hi!hclass [Ljava.lang.Strin         ");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!h4444444444444" + "'", str1, "44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###" + "'", str1, "IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        java.lang.Object[] objArray16 = new java.lang.Object[] { boolean10, 1, (short) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(objArray16, "", (int) '#', (int) (byte) 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(objArray16, 'a');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, 1, 0, 100, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[true, 1, 0, 100, 100, 100]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "truea1a0a100a100a100" + "'", str22, "truea1a0a100a100a100");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       444...        ", "4444444444444444444444444444444..", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ccc[[[        " + "'", str3, "       ccc[[[        ");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "... ###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!..." + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaa4aaaaaaaaa", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "                                                                                 hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####################4444hi!444#####################44", "h!ih!ih!ih                     ", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih444444444444444444444", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hhi!h4444444444...44444444...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                               ", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   44hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         " + "'", str1, "                                         ");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...                                       ###hhi!h444444444444444444444444444444444444444...", "                                  IH!IH!IHH!IH!IH!IHH!IH!IH!IHH###                                   hi!hi!hi!h", "HHI#HI#HI#HHI#HI#HI#HHI#HI#HI", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                       ###hhi!h444444444444444444444444444444444444444..." + "'", str4, "...                                       ###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h444444444444444444444444444444444444444...", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!ha..." + "'", str4, "hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h..." + "'", str5, "hi!hi!hi!h...");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

