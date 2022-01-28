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
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) (byte) -1, "hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 0, (int) (short) 1, "hHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHi!HHi!IHi!HHi!!" + "'", str4, "HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 100, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (-1), (int) (short) 100, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 1, "hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!", (int) (short) 1, (int) '#', "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!" + "'", str4, "hhhih!");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 0, 0, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str14, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 10, (int) (byte) 10, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str4, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) 1, (int) 'a', "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHi!HHi!IHi!HHi!!" + "'", str1, "HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        char[] charArray8 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str10, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhih!" + "'", str7, "Hhih!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str8, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHIH!" + "'", str9, "hHHIH!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!" + "'", str1, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (-1), "h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 1, (int) (short) 10, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!", 0, 0, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str4, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!ihi!!", (-1), (int) (short) -1, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!ihi!!" + "'", str4, "hhi!ihi!!");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 0, (int) (short) 10, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIH!" + "'", str1, "HHIH!");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhih!" + "'", str1, "Hhih!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", 0, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str4, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str12, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 1, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", 1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str4, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) 'a', "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) -1, "HHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!ihi!!" + "'", str15, "hhi!ihi!!");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhI!hhI!ihI!hhI!!" + "'", str1, "hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", 1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHIH!", (int) '4', "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHIH!" + "'", str4, "hHIH!");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", 0, 100, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str2, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 0, "HhHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str1, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 100, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!IHI!!" + "'", str14, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 0, 100, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (short) 0, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", (-1), 10, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str2, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (short) 10, "hhI!hhI!ihI!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHIH!", 0, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str4, "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", 100, (int) (short) 100, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", (int) (short) 0, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str4, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", 100, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str4, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        char[] charArray6 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (int) (short) 10, (int) (byte) 100, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!hhI!hhI!ihI!hhI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str2, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!hhI!hhI!ihI!hhI!!", 0, (-1), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhih!" + "'", str8, "Hhih!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str9, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str10, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!IHI!!" + "'", str11, "hHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HHI!IHI!!" + "'", str6, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str7, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 100, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!Hhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!Hhhih!" + "'", str1, "HHHI!IHI!!Hhhih!");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str2, "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (-1), "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!", (int) (byte) 1, 1, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!" + "'", str4, "HhI!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 1, (int) (byte) 1, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        char[] charArray9 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (-1), (int) (short) 1, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!" + "'", str4, "hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str2, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHi!HHi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhih!" + "'", str12, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) ' ', "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str1, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str2, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str16, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 1, 100, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!IHI!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!IHI!!" + "'", str2, "HHI!IHI!!");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhI!hhI!ihI!hhI!!", (int) (short) 100, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhI!hhI!ihI!hhI!!" + "'", str4, "hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 100, "hhhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHIH!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHIH!" + "'", str14, "HHIH!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str14, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 1, (int) (short) 0, "hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str1, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHIH!" + "'", str1, "hHIH!");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str12, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str14, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str16, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str2, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!", (int) (byte) 10, (int) (short) 0, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!" + "'", str1, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!Hhhih!", 0, (int) (byte) 1, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!" + "'", str1, "hHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHi!HHi!!", (int) (byte) -1, (int) (byte) -1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHi!HHi!!" + "'", str4, "hHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hi!", (int) (short) 1, (int) (byte) 0, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!Hhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!Hhhih!" + "'", str1, "hHHI!IHI!!Hhhih!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", 100, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str4, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("h", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str6, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        char[] charArray2 = new char[] { 'a' };
        java.lang.String str3 = org.apache.commons.lang.WordUtils.initials("hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "hhhi!hhi!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!IHI!!" + "'", str14, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str16, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHi!HHi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str2, "HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!hhI!hhI!ihI!hhI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str2, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", (int) ' ', "H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str16, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str2, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!" + "'", str1, "hHHHI!IHI!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 0, (int) (short) 1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str4, "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        char[] charArray6 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (int) (byte) 100, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str4, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str2, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        char[] charArray10 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 100, (int) 'a', "HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!" + "'", str4, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) (short) 10, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!Hhhih!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!Hhhih!" + "'", str2, "hHHI!IHI!!Hhhih!");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) ' ', "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str7, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", 10, "Hhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str1, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str1, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", (int) '4', (int) '4', "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!" + "'", str4, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str14, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!", (int) (byte) 100, (int) (short) 100, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!" + "'", str4, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str2, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str2, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", 100, 10, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!", 0, 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str2, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!ihi!!", (int) ' ', "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!ihi!!" + "'", str4, "hhi!ihi!!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str2, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) -1, 1, "hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HhHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", (int) (short) 0, (-1), "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str4, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!Hhhih!", 1, (int) (short) 1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str4, "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!Hhhih!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) '#', (int) (byte) -1, "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!" + "'", str1, "HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!", (int) (short) 0, (int) 'a', "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!" + "'", str4, "hhi!");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (int) (byte) 0, (int) (short) 1, "HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str4, "hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str2, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str1, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str12, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str13, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (short) 1, (int) (short) 100, "hHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str1, "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str18, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhih!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str16, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!" + "'", str18, "Hhhih!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) (byte) 100, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhI!hhI!ihI!hhI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhI!hhI!ihI!hhI!!" + "'", str2, "hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str17, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhih!" + "'", str19, "hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) -1, "hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) 100, "HhHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!" + "'", str1, "hHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!IHI!!" + "'", str12, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str14, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str1, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str14, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str2, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) (byte) 0, (int) (byte) -1, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 100, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!" + "'", str1, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str2, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str12, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 0, (int) (short) 0, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihi!hhi!!", (int) '4', "hHHI!IHI!!hhI!hhI!ihI!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        char[] charArray9 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str12, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!ihi!!" + "'", str16, "hhi!ihi!!");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (int) '4', 0, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!" + "'", str1, "hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHIH!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!" + "'", str2, "hHHIH!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!", (int) (byte) 1, (int) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", 100, (int) (byte) 0, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str4, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str2, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str2, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        char[] charArray6 = new char[] { '#', '#', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str9, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) 'a', "Hhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", 100, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 100, 100, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 1, (int) '4', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh" + "'", str4, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("H", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str10, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str2, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!" + "'", str1, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", 0, "Hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhih!hHhih!IHhih!!Hhih!hHhih!hHhih!IHhih!!Hhih!iHhih!hHhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!IHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!Hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!IHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!Hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!iHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!h" + "'", str4, "HHhih!hHhih!IHhih!!Hhih!hHhih!hHhih!IHhih!!Hhih!iHhih!hHhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!IHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!Hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!IHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!Hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!iHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!h");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str2, "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        char[] charArray9 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) 1, 0, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (byte) 10, (int) (byte) 10, "Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HHHI!IHI!!Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) ' ', (int) (short) 100, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) 1, (int) (short) 10, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIHHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str4, "hHHIH!HHHIHHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!" + "'", str1, "HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (-1), (int) '#', "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!", 0, (int) (byte) -1, "HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!" + "'", str4, "Hhi!");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) ' ', "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIHHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH" + "'", str1, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!Hhhih!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!IHI!!" + "'", str11, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str12, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!Hhhih!" + "'", str13, "hHHI!IHI!!Hhhih!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", 100, (int) '4', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI" + "'", str4, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh" + "'", str1, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", 100, (int) '4', "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhih!" + "'", str12, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        char[] charArray10 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHIH!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHIH!" + "'", str15, "hHIH!");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str16, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str2, "hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!" + "'", str14, "Hhhih!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!" + "'", str1, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("h", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("HI!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 100, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 100, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 0, (int) '#', "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) '#', (int) (short) 1, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) 'a', (int) (byte) 0, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!" + "'", str4, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str2, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str18, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhih!", (int) (short) 0, 0, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str14, "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) '4', "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!", (int) (short) -1, (int) (byte) 0, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!" + "'", str1, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str2, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 1, 0, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "hHHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        char[] charArray11 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) 100, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str14, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str12, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhih!", (int) (short) 1, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!" + "'", str4, "hhhih!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str13, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!" + "'", str14, "hhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) 1, 0, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str4, "Hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH" + "'", str1, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 0, 0, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", (int) (short) 10, (int) (byte) 100, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", (int) (short) 0, (int) '#', "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 0, 100, "HHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHi!HHi!!", (int) (short) 100, 0, "Hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str4, "HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHIH!", 10, 1, "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHIH!" + "'", str4, "HHIH!");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str19, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 10, (int) (short) 100, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHI!IHI!!" + "'", str9, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str12, "Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str13, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!ihi!!", (int) (byte) 10, (int) (short) -1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!ihi!!" + "'", str4, "hhi!ihi!!");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str2, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (byte) 100, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "hHHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str2, "Hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!" + "'", str2, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhih!" + "'", str9, "Hhih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str13, "Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 10, 100, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhih!" + "'", str8, "Hhih!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str9, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHIH!", (int) 'a', (int) (short) 10, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHIH!" + "'", str4, "hHIH!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (-1), 0, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!ihi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!ihi!!" + "'", str2, "hhi!ihi!!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!", 10, (int) '#', "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str4, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) 100, (int) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!", (int) (byte) 0, (int) (byte) 1, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "hHHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        char[] charArray6 = new char[] { '4', 'a', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str9, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!", 10, (int) '4', "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hhhih!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI!IHI!!" + "'", str7, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhih!" + "'", str8, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str9, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str9, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str19, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", 1, 100, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str4, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", 0, (int) (short) 10, "Hhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHhih!" + "'", str4, "HhI!hhI!ihHhih!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        char[] charArray12 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str19, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str2, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }
}

