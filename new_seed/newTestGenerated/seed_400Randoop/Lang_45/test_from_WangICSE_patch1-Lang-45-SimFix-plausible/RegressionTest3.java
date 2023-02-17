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
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 100, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str19, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhI!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHi!HHi!IHhI!" + "'", str18, "hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str19, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str19, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHI!IHI!!" + "'", str20, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhi!" + "'", str1, "Hhi!hhi!ihhi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHhi!ihi!!iHhi!ihi!!!", (int) (short) -1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhi!ihi!!iHhi!ihi!!!" + "'", str4, "hHHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHhHhHI!IHI!!hhih!" + "'", str1, "HHI!HHI!IHhHhHI!IHI!!hhih!");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhi!" + "'", str1, "Hhi!hhi!ihhi!");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhi!" + "'", str12, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!Hi!" + "'", str13, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str14, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!" + "'", str15, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str16, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHi!HHi!IHi!HHi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str10, "HHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", (int) (short) 0, (-1), "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str4, "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (short) 10, (int) '4', "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihhi!" + "'", str11, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!" + "'", str13, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhI!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHi!HHi!IHhI!" + "'", str9, "hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihI!hhI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str2, "HhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!ihi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!ihi!!" + "'", str2, "Hhi!ihi!!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHhIh!hIhHhhih!HhIh!h!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHhIh!hIhHhhih!HhIh!h!" + "'", str2, "HhHhIh!hIhHhhih!HhIh!h!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", (int) (short) -1, (int) (byte) 0, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str1, "Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (short) 100, "Hhi!hhi!ihh", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!" + "'", str14, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!" + "'", str16, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHhIh!hIhHhIh!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHiH!HiHhHiH!H!" + "'", str1, "HHhHiH!HiHhHiH!H!");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHi!HHi!IHi!HHi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str2, "hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!ihi!!" + "'", str8, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHI!IHI!!" + "'", str9, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHhHI!IHI!!hhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!HHI!IHHI!" + "'", str15, "hHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str16, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhHI!IHI!!hhih!" + "'", str17, "HHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str7, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhI!hhI!ihI!hhI!!" + "'", str1, "hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!", (int) (short) 0, (int) '4', "hHHI!IHI!!hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!" + "'", str4, "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str2, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!Hi!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhih!" + "'", str14, "Hhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!Hi!" + "'", str16, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str14, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str17, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHi!HHi!IHi!HHi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHi!HHi!IHi!HHi!!" + "'", str2, "hhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!" + "'", str1, "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!IHI!!" + "'", str16, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!" + "'", str20, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        char[] charArray3 = new char[] { 'a' };
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!Hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hhhi!ihi!!Hi!" + "'", str5, "Hhhi!ihi!!Hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!IHI!!" + "'", str13, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHhI!" + "'", str14, "HHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str16, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str18, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str16, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str16, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!" + "'", str17, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str19, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str20, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hi!" + "'", str14, "Hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhi!" + "'", str15, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str16, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HhhHi!HHi!IHi!HHi!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str6, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str7, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!" + "'", str2, "Hhhih!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihhi!", 10, (int) (short) 10, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str4, "hhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!IHI!!IhHI!IHI!!!", 1, "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!" + "'", str4, "HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHhIh!hIhHhhih!HhIh!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", (int) (byte) 100, 0, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str4, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!" + "'", str2, "HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhHi!HHi!IHi!HHi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str17, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHi!HHi!IHi!HHi!!" + "'", str20, "hhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!IHI!!" + "'", str12, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str13, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!" + "'", str1, "hHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!", (int) (short) 0, 1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) -1, 0, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str1, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HI!" + "'", str1, "hHHI!IHI!!HI!");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHhI!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHhI!" + "'", str2, "hHi!HHi!IHhI!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str17, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!" + "'", str2, "Hhhi!ihi!!");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihhi!", (int) (short) 100, (int) (byte) 10, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHi!HHi!IHi!HHi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str18, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str22, "hHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str2, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHI!IHI!!" + "'", str19, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str20, "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhih!", (int) '4', "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!" + "'", str4, "hhhih!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (byte) 0, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str2, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!Hi!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str10, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str11, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhi!" + "'", str12, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hi!" + "'", str13, "Hhhi!ihi!!hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!", (int) (short) 100, "HhHhIh!hIhHhhih!HhIh!h!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!" + "'", str4, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhih!" + "'", str6, "Hhih!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str7, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!Hi!", (int) (byte) -1, "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!" + "'", str4, "HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str2, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", (int) (byte) 10, "hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHI!IHI!!hhih!", (int) ' ', (int) (short) 0, "hhhi!ihi!!Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", (int) 'a', "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str4, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        char[] charArray1 = new char[] {};
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHI!IHI!HHI!!" + "'", str1, "HhHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str2, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!", (int) (byte) 10, 0, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "hHHHI!HHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhHI!IHI!!IhHI!IHI!!!" + "'", str1, "hhhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHhIh!hIhHhIh!h!", (int) (byte) 100, "HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhIh!hIhHhIh!h!" + "'", str4, "hhHhIh!hIhHhIh!h!");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!", (int) 'a', 1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!", (int) (short) 0, "HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (-1), (int) (short) 1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        char[] charArray9 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str1, "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 10, (int) (byte) 1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str1, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) ' ', "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 1, (int) ' ', "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 100, (int) (short) 1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!" + "'", str2, "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (byte) 100, "Hhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str18, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str22, "hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", (-1), "hhhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhih!" + "'", str1, "Hhhi!ihi!!hhih!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HI!" + "'", str1, "HHHI!IHI!!HI!");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhih!", (int) ' ', "HHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhih!" + "'", str4, "Hhhi!ihi!!hhih!");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHi!HHi!IHi!HHi!!", (int) '#', (int) (short) 10, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhhhi!ihi!!" + "'", str4, "hHi!HHi!IHhhhi!ihi!!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!", (int) (short) 0, (int) (byte) 1, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!" + "'", str4, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHhIh!hIhHhhih!HhIh!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHhIh!hIhHhhih!HhIh!h!" + "'", str1, "HhHhIh!hIhHhhih!HhIh!h!");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhI!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhi!ihi!!" + "'", str6, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHi!HHi!IHhI!" + "'", str8, "hHi!HHi!IHhI!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) ' ', (-1), "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        char[] charArray7 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!" + "'", str9, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHhHI!HHI!IHHI!", 0, "hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str4, "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str11, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!ihi!!" + "'", str12, "hhi!ihi!!");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", (int) (byte) 0, "HHhHI!IHI!!hhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!iHhi!ihi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str14, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hi!" + "'", str15, "hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str16, "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "HHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str16, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhI!hhI!ihI!hhI!!", (int) (short) 1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhI!hhI!ihI!hhI!!" + "'", str4, "hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) (byte) 10, (int) ' ', "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHI!HHI!!", (int) (byte) 0, "H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str4, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        char[] charArray16 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHI!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHI!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str20, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str22, "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str23, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str24, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihhi!" + "'", str25, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHi!HHi!IHHI!" + "'", str26, "HHi!HHi!IHHI!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        char[] charArray6 = new char[] { '4', 'a', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!ihi!!" + "'", str9, "Hhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!", (int) (short) 10, 10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str4, "HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!" + "'", str2, "hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", 0, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!ihi!!" + "'", str9, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHI!IHI!!" + "'", str9, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str12, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!IHI!!" + "'", str17, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str20, "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 0, "Hhhi!ihi!!ihhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!hI!", (int) '4', "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!hI!" + "'", str4, "hHHI!IHI!!hI!");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (byte) -1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHhI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHi!HHi!IHhI!" + "'", str13, "HHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str11, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHi!HHi!IHHHHI!IHI!!" + "'", str12, "HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str13, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!" + "'", str1, "hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        char[] charArray10 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!IhHI!IHI!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHI!IHI!!hhih!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str14, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHhHI!IHI!!hhih!" + "'", str15, "hHhHI!IHI!!hhih!");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!" + "'", str1, "hHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("h", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str5, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str6, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (short) 1, (int) (byte) 10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHI!HHI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str2, "HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (int) (short) 100, "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhI!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHi!HHi!IHhI!" + "'", str19, "hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str20, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str21, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str22, "hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", (int) '4', "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hi!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hi!" + "'", str14, "hhhi!ihi!!hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHI!HHI!IHI!HHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHI!HHI!IHI!HHI!!" + "'", str2, "HhHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", 10, "hHi!HHi!IHhI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", 100, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!" + "'", str4, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhi!" + "'", str17, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHI!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str14, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str15, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHHI!" + "'", str17, "HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str18, "hHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.Class<?> wildcardClass16 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!" + "'", str14, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhI!hhI!ihI!hhI!!" + "'", str1, "hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hhi!ihi!hhi!!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str15, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str16, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhhi!hhi!ihi!hhi!!" + "'", str17, "HHhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!", (int) (byte) 100, (int) (short) -1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (short) 0, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!" + "'", str4, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str12, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!" + "'", str14, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", 0, "Hhhhih!hihhhih!h!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (int) (byte) 100, "HhI!hhI!ihhhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHIH!" + "'", str4, "hHIH!");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) 0, (int) ' ', "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!hhI!ihhi!" + "'", str11, "HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str12, "HHi!HHi!IHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhi!" + "'", str13, "Hhi!hhi!ihhi!");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHhi!hhi!ihhi!", (int) (byte) 100, (int) '#', "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHhi!hhi!ihhi!" + "'", str4, "hHi!HHi!IHHhi!hhi!ihhi!");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihh", 100, 1, "HHi!HHi!IHi!HHi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        char[] charArray11 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!", (int) (short) -1, (int) '#', "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!" + "'", str4, "HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHhHI!HHI!IHHI!", (int) (short) 100, (int) '4', "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHI!HHI!IHHI!" + "'", str4, "hHi!HHi!IHhHI!HHI!IHHI!");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) (byte) 0, "hHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str2, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!ihi!!" + "'", str7, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str8, "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHhHhHI!IHI!!hhih!" + "'", str1, "hHI!HHI!IHhHhHI!IHI!!hhih!");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!" + "'", str1, "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihHi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhi!" + "'", str13, "Hhi!hhi!ihhi!");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHiH!HiHhHiH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hihhhih!h!" + "'", str1, "Hhhhih!hihhhih!h!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        char[] charArray13 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str18, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHI!HHI!IHHI!" + "'", str20, "hHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str21, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhI!hhI!ihI!hhI!!" + "'", str1, "HHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str2, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", 100, "hHI!HHI!IHI!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str4, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhHI!IHI!!IhHI!IHI!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhHI!IHI!!IhHI!IHI!!!" + "'", str2, "HhhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HI!", 100, (int) (short) 1, "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", 0, (int) (byte) 10, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str4, "Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (byte) 100, (int) (byte) 0, "hhhi!ihi!!Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HI!" + "'", str1, "HHHI!IHI!!HI!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHhI!", (int) (byte) 100, (int) 'a', "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhI!" + "'", str4, "HHi!HHi!IHhI!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", 10, (int) (short) -1, "hHHhi!ihi!!iHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHi!HHi!!", (int) (short) 1, "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str4, "HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!ihi!!" + "'", str8, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str11, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str8, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!iHhi!ihi!!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI!IHI!!" + "'", str7, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 10, 100, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!IHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!Hhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!IHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!iHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!", 0, "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!IHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!Hhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!IHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!iHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!" + "'", str4, "hHhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!IHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!Hhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!IHhhi!ihi!!Hi!HHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!iHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!hHhhi!ihi!!Hi!hHhhi!ihi!!Hi!IHhhi!ihi!!Hi!!Hhhi!ihi!!Hi!!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!" + "'", str1, "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str13, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihHhHhi!ihi!!HHIH!" + "'", str1, "Hhi!hhi!ihHhHhi!ihi!!HHIH!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhih!" + "'", str7, "Hhih!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str9, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", (int) (short) 100, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!iHhi!ihi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str12, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str14, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("H", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHi!HHi!IHi!HHi!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhi!" + "'", str20, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHIH!" + "'", str22, "hHIH!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str23, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihi!hhi!!" + "'", str24, "Hhi!hhi!ihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHhi!ihi!!iHhi!ihi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhih!" + "'", str10, "hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHhi!ihi!!iHhi!ihi!!!" + "'", str12, "hHHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!" + "'", str2, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!IHI!!" + "'", str12, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str14, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhih!hihhhih!h!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhih!hihhhih!h!" + "'", str14, "hhhhih!hihhhih!h!");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhih!" + "'", str19, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!IHI!!" + "'", str20, "HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str21, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str22, "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        char[] charArray4 = new char[] { 'a', '#', '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray4);
        java.lang.Class<?> wildcardClass6 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, #, 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hI!" + "'", str5, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!", (int) (short) -1, (int) (short) -1, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!" + "'", str4, "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhih!" + "'", str9, "hhih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str10, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str1, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str2, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihHi!", (int) '4', (int) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ih" + "'", str4, "hhI!hhI!ih");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", (int) '#', (int) (byte) 0, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!" + "'", str1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) (byte) 0, "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str19, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!ihi!!" + "'", str21, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str23, "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!" + "'", str1, "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str13, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str16, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", (int) (short) 100, "hhI!hhI!ihhHI!HHI!IHHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhI!hhI!ihhHI!HHI!IHHI!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhI!hhI!ihhHI!HHI!IHHI!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhI!hhI!ihhHI!HHI!IHHI!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhI!hhI!ihhHI!HHI!IHHI!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str4, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhI!hhI!ihhHI!HHI!IHHI!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhI!hhI!ihhHI!HHI!IHHI!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhI!hhI!ihhHI!HHI!IHHI!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhI!hhI!ihhHI!HHI!IHHI!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str13, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", (int) 'a', 10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "HHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!" + "'", str1, "HHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hHI!IHI!!" + "'", str7, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str8, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str1, "hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str2, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", (int) (byte) 1, (int) (short) 1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str4, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!", (int) (short) 10, 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ih" + "'", str4, "hhi!hhi!ih");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhih!", (int) ' ', "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!" + "'", str4, "hhhih!");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!" + "'", str17, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihHhI!hhI!ihhHI!HHI!IHHI!" + "'", str1, "hhi!hhi!ihHhI!hhI!ihhHI!HHI!IHHI!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", 100, 1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHhIh!hIhHhhih!HhIh!h!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str19, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhi!" + "'", str23, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", (int) (byte) 100, "h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", 0, (int) (short) 100, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str4, "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str13, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhI!hhI!ihI!hhI!!" + "'", str1, "HhI!hhI!ihhhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!" + "'", str13, "HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!" + "'", str1, "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHI!IHI!!hhih!" + "'", str1, "hHhHI!IHI!!hhih!");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhHI!HHI!IHHI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhI!hhI!ihhHI!HHI!IHHI!" + "'", str17, "HhI!hhI!ihhHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str19, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhHI!HHI!IHHI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihhHI!HHI!IHHI!" + "'", str2, "HhI!hhI!ihhHI!HHI!IHHI!");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhi!" + "'", str2, "hhi!hhi!ihhi!");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str17, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!" + "'", str19, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HI!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HI!" + "'", str2, "HHHI!IHI!!HI!");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", (-1), 1, "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        char[] charArray9 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", (int) (byte) -1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhih!hihhhih!h!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhih!hihhhih!h!" + "'", str2, "hhhhih!hihhhih!h!");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str10, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!" + "'", str11, "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!" + "'", str1, "hHhih!");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) '4', (int) (byte) 0, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", (-1), (int) ' ', "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!IhHI!IHI!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHhIh!hIhHhIh!h!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str15, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str17, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str2, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hi!" + "'", str1, "hhhi!ihi!!hi!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!", (int) (byte) 100, "Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhih!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhih!");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhI!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHhI!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHi!HHi!IHhI!" + "'", str20, "hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHi!HHi!IHhI!" + "'", str22, "HHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhih!" + "'", str23, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str24, "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str18, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str20, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str21, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHi!HHi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str2, "HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!", 1, (int) (short) 100, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHhi!ihi!!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihHhHhi!ihi!!HHIH!" + "'", str1, "Hhi!hhi!ihHhHhi!ihi!!HHIH!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihI!hhI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str7, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHi!HHi!IHHHHI!IHI!!" + "'", str8, "hHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str9, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (byte) 100, (int) ' ', "hHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str1, "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!" + "'", str1, "hHHIH!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) 'a', "HHhi!ihi!!iHhi!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhi!", (int) (byte) 1, 10, "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!" + "'", str4, "hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (short) 1, (int) (short) 0, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!" + "'", str1, "HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!" + "'", str1, "Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!iHhi!ihi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!IHI!!" + "'", str18, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str23, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhi!ihi!!iHhi!ihi!!!" + "'", str24, "HHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", 1, "Hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str4, "HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!hI!" + "'", str1, "HHHI!IHI!!hI!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", (int) '4', "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str4, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHIH!", (int) (short) -1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!" + "'", str4, "hHHIH!");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str2, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!", (int) (byte) -1, (int) '#', "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 100, (-1), "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhI!" + "'", str1, "HHi!HHi!IHhI!");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!" + "'", str1, "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!ihi!hhi!!", charArray12);
        java.lang.Class<?> wildcardClass22 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str21, "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (short) 10, "HhI!hhI!ihI!hhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!", 0, "hhi!hhi!ih", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!" + "'", str4, "HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str1, "hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str1, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("HI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str8, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!", (int) (byte) 10, "hhi!hhi!ihHhI!hhI!ihhHI!HHI!IHHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!" + "'", str4, "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", (-1), 10, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhih!" + "'", str16, "hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str17, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!", (int) (byte) 1, (int) (short) 0, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", (int) (byte) 100, (int) (short) 100, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hhhi!ihi!!" + "'", str4, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hhhi!ihi!!");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 1, (int) (byte) -1, "hHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", (int) (short) 1, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!Hi!" + "'", str1, "hhhi!ihi!!Hi!");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!ihi!!" + "'", str12, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str15, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihI!hhI!!", (int) ' ', "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str4, "hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str1, "HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!IHI!!hhih!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str9, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhHI!IHI!!hhih!" + "'", str11, "hhHI!IHI!!hhih!");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhi!" + "'", str18, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!" + "'", str20, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhHI!HHI!IHHI!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihhHI!HHI!IHHI!" + "'", str2, "hhI!hhI!ihhHI!HHI!IHHI!");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str1, "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHHI!" + "'", str14, "hHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str15, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str16, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!hI!", (int) (byte) 0, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!hI!" + "'", str4, "HHHI!IHI!!hI!");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str14, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str15, "hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!", (int) '#', "HHHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!IhHI!IHI!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str14, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str16, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", (int) (short) 0, "HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhih!hihhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hihhhih!h!" + "'", str1, "Hhhhih!hihhhih!h!");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str2, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", 10, (int) ' ', "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HhhHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str8, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str9, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str11, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str12, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (int) 'a', (int) (short) -1, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (int) (short) -1, (int) (short) 10, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!HhI!hhI!ihHi!" + "'", str4, "hHHHI!HHI!HhI!hhI!ihHi!");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhi!", (int) (short) 10, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!" + "'", str4, "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", (int) (short) -1, (int) '4', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi" + "'", str4, "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }
}

