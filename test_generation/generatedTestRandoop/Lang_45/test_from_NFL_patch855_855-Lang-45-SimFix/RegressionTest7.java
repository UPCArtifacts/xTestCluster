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
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str2, "hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str17, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str20, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhHhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhHhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str2, "hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhHhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhHI!HHI!IHHI!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!ihi!!" + "'", str12, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihhHI!HHI!IHHI!" + "'", str15, "hhI!hhI!ihhHI!HHI!IHHI!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhi!ihihHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhi!ihihHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhHhhi!ihihHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hihhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hihhhih!h!" + "'", str1, "Hhhhih!hihhhih!h!");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str17, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!IHI!!" + "'", str18, "HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str19, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str20, "hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhih!hihhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHIH!HIHHHIH!H!" + "'", str1, "hHHHIH!HIHHHIH!H!");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih" + "'", str1, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str17, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!", (int) (byte) 0, (int) (byte) 0, "HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!" + "'", str4, "HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) (short) 10, (-1), "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHHHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHhih!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhih!" + "'", str10, "Hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str12, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str14, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!" + "'", str15, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str1, "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhi!" + "'", str1, "Hhhhi!hhi!hhi!hhi!ihhi!");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str20, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHIH!" + "'", str21, "HHIH!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str22, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhih!" + "'", str23, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!hhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!hhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!ihhi!hhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihhhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hi!" + "'", str24, "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!hhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!hhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!ihhi!hhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihhhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hi!");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhhhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hHhI!hhI!ihHi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhhhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hHhI!hhI!ihHi!" + "'", str2, "hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhhhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hHhI!hhI!ihHi!");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhih!" + "'", str8, "Hhih!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!ihi!!Hi!" + "'", str10, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!" + "'", str11, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        char[] charArray14 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hi!" + "'", str23, "Hhhi!ihi!!hi!");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        char[] charArray15 = new char[] { '#', '#', '4' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!ihi!!iHhi!ihi!!!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhI!hhI!ihhi!" + "'", str23, "hhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str24, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str25, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhi!ihi!!iHhi!ihi!!!" + "'", str26, "hHhi!ihi!!iHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHhIh!hIhHhhih!HhIh!h!", (int) '4', "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!hHHHI!IHI!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhIh!hIhHhhih!HhIh!h!" + "'", str4, "HhHhIh!hIhHhhih!HhIh!h!");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str16, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhih!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str19, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!ihi!!hhih!" + "'", str22, "Hhhhi!ihi!!hhih!");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HI!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHI!IHI!!" + "'", str15, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHI!!HI!" + "'", str16, "hHHI!IHI!!HI!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!iHHI!HHI!IHI!HHI!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!iHHI!HHI!IHI!HHI!!" + "'", str2, "hHhi!hhi!iHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        char[] charArray18 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHI!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHI!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str22, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str24, "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str25, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihhi!" + "'", str27, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHi!HHi!IHHI!" + "'", str28, "HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!" + "'", str29, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!" + "'", str11, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!" + "'", str13, "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHHI!HHI!IHHI!HI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHHI!HHI!IHHI!HI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str16, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhi!" + "'", str12, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str13, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!" + "'", str2, "HHhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi" + "'", str2, "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 1, 1, "HhHhhi!ihihHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!", (int) '#', (-1), "hHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!" + "'", str4, "hHHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) 10, (int) ' ', "hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!Ihhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str4, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!Ihhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", (int) '#', (int) (short) 1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str4, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IH", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IH" + "'", str2, "HHI!HHI!IH");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        char[] charArray9 = new char[] { 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhih!" + "'", str11, "Hhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str13, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str14, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str17, "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhih!" + "'", str10, "Hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str12, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str13, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str20, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str23, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str24, "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 100, 0, "HHi!HHi!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!", (int) (short) 100, "Hhhi!ihi!!hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!" + "'", str4, "HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhHI!IHI!!IhHI!IHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhi!" + "'", str12, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!Hi!" + "'", str13, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str15, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHhhHI!IHI!!IhHI!IHI!!!" + "'", str16, "hHhhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str12, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str15, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str13, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHHHHI!IHI!!" + "'", str14, "HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!" + "'", str1, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str12, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str14, "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!", 100, (int) (short) -1, "hHhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str4, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!hI!", (int) (byte) 10, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!" + "'", str4, "HHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!ihi!!" + "'", str7, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IH", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhih!" + "'", str7, "Hhih!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str11, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str12, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hi!" + "'", str17, "Hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str19, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str20, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!", 10, (int) (short) 1, "hHi!HHi!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!hHi!HHi!IH" + "'", str4, "hHHHI!IHI!hHi!HHi!IH");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!ihhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "hHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihi!!ihhi!ihi!!!" + "'", str18, "Hhhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHI!!hI!" + "'", str19, "HHHI!IHI!!hI!");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str16, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str17, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!" + "'", str21, "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "HHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str1, "hHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ih", charArray12);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!hhI!ihhi!" + "'", str20, "hhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ih" + "'", str21, "Hhi!hhi!ih");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHhhhi!ihi!!HHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHIhHi!HHi!IHhhhi!ihi!!!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!hHi!HHi!IHhhhi!ihi!!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHhhhi!ihi!!HI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHhHi!HHi!IHhhhi!ihi!!I!!!I!HHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHhhhi!ihi!!HHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHIhHi!HHi!IHhhhi!ihi!!!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!hHi!HHi!IHhhhi!ihi!!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHhhhi!ihi!!HI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHhHi!HHi!IHhhhi!ihi!!I!!!I!HHI!!" + "'", str2, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHhhhi!ihi!!HHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHIhHi!HHi!IHhhhi!ihi!!!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!hHi!HHi!IHhhhi!ihi!!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHhhhi!ihi!!HI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHhHi!HHi!IHhhhi!ihi!!I!!!I!HHI!!");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str2, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhI!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str20, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!", (int) (short) 10, "Hhi!hhi!ihh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!HHi!HHi!IHHHHI!IHI!!" + "'", str1, "hhHHI!HHI!HHi!HHi!IHHHHI!IHI!!");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhhih!hihhhih!h!hhhi!ihihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhih!hihhhih!h!hhhi!ihihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhi!hhi!ihhhhhih!hihhhih!h!hhhi!ihihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhih!" + "'", str14, "Hhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str15, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhI!hhI!ihI!hhI!!" + "'", str1, "hhI!hhI!ihhhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", (int) (short) 0, (int) 'a', "HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str10, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str11, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!HI!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!HI!");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 100, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str14, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str17, "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!", 100, "hhhhi!hhi!HHhhi!hhi!ihi!hhi!!hhi!hhi!ihHHhhi!hhi!ihi!hhi!!hhhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str4, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        char[] charArray11 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hhhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str16, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!ihi!!" + "'", str18, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!ihi!!");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!", (int) (short) -1, 100, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHi!" + "'", str4, "hHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHi!");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHi!HHi!IH", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!" + "'", str22, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhi!" + "'", str15, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str17, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhi!");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str17, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!", 0, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str16, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) '#', (int) '#', "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHi!HHi!IHi!HHi!!", (int) '4', "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!hhi!hhi!ih!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhihhi!hhi!ih!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhhhi!hhi!ihi!!!hhi!!ihhi!hhi!ihi!hhi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str4, "HHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        char[] charArray8 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str11, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHHI!IHI!!IHHI!IHI!!!", (int) (byte) -1, (int) '#', "hhi!hhi!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIhhi!hhi!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIhhi!hhi!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!" + "'", str13, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!" + "'", str16, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", 0, (int) 'a', "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHHi!HHi!IHi!HHi!!", (int) (short) 10, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str4, "HHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) 'a', 0, "hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str11, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihHhHhi!ihi!!HHIH!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        char[] charArray9 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!", (int) (short) 10, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhHI!IHI!!IhHI!IHI!!!", (-1), (int) (short) 0, "HHhHI!IHI!!hhih!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhhi!ihi!!hhih!", (int) (byte) 10, "HHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhih!" + "'", str4, "hhi!hhi!ihhhhhi!ihi!!hhih!");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!" + "'", str13, "hHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str14, "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!" + "'", str16, "hHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str19, "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!" + "'", str21, "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str15, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhiHHHIH!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhHHHIH!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!HHHIH!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhiHHHIH!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhHHHIH!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhiHHHIH!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhHHHIH!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!HHHIH!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhiHHHIH!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhHHHIH!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!", (int) 'a', 1, "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHIhhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!" + "'", str4, "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHIhhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", 10, 100, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) (byte) 1, (int) ' ', "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) (short) -1, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!IHI!!IhHI!IHI!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str15, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str16, "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHI!HHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str17, "hHHHI!HHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!IHI!!hhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhih!" + "'", str16, "Hhhi!ihi!!hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str17, "hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (-1), "HHHhi!ihi!!iHhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray7);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str14, "hHI!HHI!IHhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHi!HHi!IHi!HHi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHi!HHi!IHi!HHi!!" + "'", str2, "HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!" + "'", str1, "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str1, "hHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!HHhhi!hhi!ihi!hhi!!hhi!hhi!ihHHhhi!hhi!ihi!hhi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!HHhhi!hhi!ihi!hhi!!hhi!hhi!ihHHhhi!hhi!ihi!hhi!!hhhi!ihi!!" + "'", str1, "Hhhhi!hhi!HHhhi!hhi!ihi!hhi!!hhi!hhi!ihHHhhi!hhi!ihi!hhi!!hhhi!ihi!!");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str15, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str16, "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhHI!HHI!IHHI!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhi!hhi!ihhi!" + "'", str10, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!ihi!!Hi!" + "'", str11, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!" + "'", str2, "hHi!HHi!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHhi!ihi!!iHhi!ihi!!!", (int) (short) 10, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhIHHI!HHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!iHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!" + "'", str4, "HHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhIHHI!HHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!iHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!" + "'", str1, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!" + "'", str21, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhi!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str9, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhi!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str10, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhi!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str12, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!HHI!IHHI!" + "'", str13, "hHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str14, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        char[] charArray16 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str25, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str14, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!" + "'", str15, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hi!" + "'", str1, "Hhhi!ihi!!hi!");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhI!hhI!ihhHI!HHI!IHHI!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhI!hhI!ihhHI!HHI!IHHI!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhI!hhI!ihhHI!HHI!IHHI!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhI!hhI!ihhHI!HHI!IHHI!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", 100, (int) '#', "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str4, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ih", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ih" + "'", str10, "Hhi!hhi!ih");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!" + "'", str1, "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!", (int) ' ', (int) (byte) 100, "hHI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str4, "hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", (int) ' ', "HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!iHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!hhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!i!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!ihi!!hi!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!iHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!hhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!i!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!ihi!!hi!");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str12, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str13, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!" + "'", str14, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        char[] charArray6 = new char[] { ' ', 'a', '#', 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!ihhi!ihi!!!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a, #, a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str7, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihi!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", (int) (byte) 0, (int) (short) -1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str4, "hhhhi!ihi!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", (int) (short) 10, 10, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihHhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str4, "Hhi!hhi!ihHhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str1, "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!", 0, (int) (byte) 100, "hHHHI!HHI!HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!hHHHI!HHI!HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!IHI!HHI!!" + "'", str4, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!hHHHI!HHI!HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!IHI!HHI!!");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!hhI!ihI!hhI!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IhhI!hhI!ihI!hhI!!HI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HhhI!hhI!ihI!hhI!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HhhI!hhI!ihI!hhI!!HI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIhhI!hhI!ihI!hhI!!!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHIhhI!hhI!ihI!hhI!!!HHI!!IHHI!HHI!IHI!HHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str19, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str22, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str17, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!!", 10, (int) ' ', "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!" + "'", str4, "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHI!IHI!!" + "'", str9, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str11, "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!IHI!!IhHI!IHI!!!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str13, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str17, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str18, "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhiHHHIH!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhHHHIH!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!HHHIH!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhiHHHIH!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhHHHIH!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", 0, (int) (short) 0, "HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhih!" + "'", str9, "Hhih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhi!" + "'", str12, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str13, "HhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHIhhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHIhhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!" + "'", str1, "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHIhhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!hhih!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhih!" + "'", str10, "Hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!ihi!!Hi!" + "'", str12, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHi!HHi!IHHHHI!IHI!!" + "'", str13, "HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhih!" + "'", str14, "Hhhi!ihi!!hhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ih", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str14, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHIH!" + "'", str15, "hHIH!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!hhI!ih" + "'", str18, "hhI!hhI!ih");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhi!hhi!ihi!hhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihi!hhi!!" + "'", str2, "Hhi!hhi!ihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        char[] charArray12 = new char[] { '4', 'a', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHHHHI!IHI!!" + "'", str20, "HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihI!hhI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI!IHI!!" + "'", str7, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str8, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str9, "hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhI!hhI!ihHi!" + "'", str19, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "hhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHI!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihHhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str15, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str16, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHi!HHi!IHHI!" + "'", str18, "HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihHhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str20, "Hhi!hhi!ihHhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!IHI!HHI!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHI!HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!IHI!HHI!!" + "'", str2, "hHHHI!HHI!HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!IHI!HHI!!");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!" + "'", str12, "hHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str13, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str14, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str13, "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) ' ', "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!hi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!hi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!", (int) (short) 1, (int) ' ', "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!", 10, (int) (short) 1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str4, "HHI!HHI!IHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "HHHHI!IHI!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!" + "'", str11, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!!", 100, "hhi!hhi!ihhhi!hhi!ihhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!" + "'", str4, "hHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        char[] charArray7 = new char[] { '4', '#', 'a', ' ', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a,  , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!HHI!IHHI!" + "'", str13, "hHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str16, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str17, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (byte) 1, (int) '#', "HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!HHIH!" + "'", str4, "Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!HHIH!");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHhi!hhi!ihhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHhi!hhi!ihhi!" + "'", str2, "hHi!HHi!IHHhi!hhi!ihhi!");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str2, "hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHhhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHhhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHhhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (byte) 100, (-1), "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        char[] charArray9 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str12, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray6);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str12, "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str1, "Hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        char[] charArray13 = new char[] { '#', '#', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str21, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", (int) '4', 0, "hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!Hhhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str4, "hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!Hhhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!hhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!hhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!ihhi!hhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihhhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hi!" + "'", str16, "Hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!" + "'", str17, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str18, "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!hhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!hhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!ihhi!hhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihhhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hi!" + "'", str19, "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!hhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!hhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!ihhi!hhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihhhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhi!HHhhi!hhi!ihi!hhi!!hhi!hhi!ihHHhhi!hhi!ihi!hhi!!hhhi!ihi!!", (int) (byte) -1, (int) (byte) -1, "HHHHI!IHI!HHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!HHhhi!hhi!ihi!hhi!!hhi!hhi!ihHHhhi!hhi!ihi!hhi!!hhhi!ihi!!" + "'", str4, "hhhhi!hhi!HHhhi!hhi!ihi!hhi!!hhi!hhi!ihHHhhi!hhi!ihi!hhi!!hhhi!ihi!!");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!" + "'", str1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!", 0, (int) '#', "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhhI!hhI!ihI!hhI!!" + "'", str4, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("HI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str8, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str10, "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!HI!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!HI!");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) -1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", 100, (int) (short) -1, "HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str18, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str22, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!ihi!!" + "'", str8, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str10, "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!ihi!!" + "'", str9, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str11, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str13, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhih!" + "'", str14, "Hhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str15, "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str16, "hHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str14, "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!" + "'", str17, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str19, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", (int) (byte) 10, 10, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!" + "'", str1, "Hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!" + "'", str2, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!", 10, "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!" + "'", str4, "hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", (int) '4', "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str4, "hHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhi!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!" + "'", str1, "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!ihhi!ihi!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!ihi!!" + "'", str7, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhi!ihi!!ihhi!ihi!!!" + "'", str8, "Hhhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHhI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHhI!" + "'", str2, "HHi!HHi!IHhI!");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!HHHI!IHI!!hhI!hhI!ihI!hhI!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHHHHI!IHI!!hhI!hhI!ihI!hhI!!I!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!HHHI!IHI!!hhI!hhI!ihI!hhI!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHHHHI!IHI!!hhI!hhI!ihI!hhI!!I!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!HHHI!IHI!!hhI!hhI!ihI!hhI!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHHHHI!IHI!!hhI!hhI!ihI!hhI!!I!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhi!" + "'", str15, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str2, "HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!HhHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhi!" + "'", str15, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str17, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str14, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str15, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str16, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        char[] charArray13 = new char[] {};
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HhHhIh!hIhHhIh!h!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihHi!", charArray13);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str19, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhI!hhI!ihHi!" + "'", str21, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhHhIh!hIhHhIh!h!" + "'", str23, "HhHhIh!hIhHhIh!h!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str24, "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhI!hhI!ihHi!" + "'", str25, "hhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!IHI!!" + "'", str26, "hHHI!IHI!!");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhi!ihi!!hhI!hhI!ihI!hhI!!", 100, "hhI!hhI!ihhHI!HHI!IHHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhhhI!hhI!ihhHI!HHI!IHHI!i!ihi!!hhI!hhI!ihI!hhI!!" + "'", str4, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhhhI!hhI!ihhHI!HHI!IHHI!i!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!hhi!hhi!ihhi!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str15, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihI!hhI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHi!HHi!IHi!HHi!!" + "'", str12, "hHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!", (int) 'a', "h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str19, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str21, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str22, "HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhhhI!hhI!ihhHI!HHI!IHHI!i!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhhHHHHi!HHi!IHHhi!hhi!ihhi!I!IHI!!HHi!HHi!IHi!HHi!!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhhHHHHi!HHi!IHHhi!hhi!ihhi!I!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!" + "'", str1, "hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        char[] charArray16 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str25, "hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!" + "'", str26, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str27, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str13, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str14, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str15, "hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!" + "'", str2, "HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", 100, (int) (short) 10, "hHHHI!HHI!IHI!HHI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!ihi!!" + "'", str13, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!ihi!!" + "'", str14, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhI!hhI!ihHi!" + "'", str14, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str16, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str17, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!IHI!!hhih!" + "'", str1, "hhHI!IHI!!hhih!");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str11, "hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!", (-1), "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHI!HHI!IHI!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!" + "'", str4, "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str7, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!IhHI!IHI!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str16, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str18, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str19, "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str20, "HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        char[] charArray9 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!" + "'", str13, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str15, "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str10, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", (int) ' ', "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!" + "'", str4, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str22, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhih!" + "'", str10, "Hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str12, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str13, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!", (int) (byte) -1, (int) '#', "Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!" + "'", str4, "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        char[] charArray17 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHI!IHI!HHI!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhiHHHIH!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhHHHIH!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!HHHIH!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhiHHHIH!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhHHHIH!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhih!" + "'", str22, "hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str24, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str25, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!" + "'", str27, "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhihhhih!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhhhhih!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhih!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhihhhih!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhhhhih!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str28, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhihhhih!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhhhhih!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhih!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhihhhih!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhhhhih!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!HhI!hhI!ihHi!" + "'", str1, "hHHHI!HHI!HhI!hhI!ihHi!");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!" + "'", str2, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 10, (int) (byte) -1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 1, "HhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhi!ihi!hhi!!", (int) (byte) -1, (int) '4', "hHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!" + "'", str4, "hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str18, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str19, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str20, "hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str16, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhI!hhI!ihHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHI!HHI!IHHI!" + "'", str1, "hHi!HHi!IHhHI!HHI!IHHI!");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHi!HHi!IHhI!hHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!hHHi!HHi!IHhI!hHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!iHHi!HHi!IHhI!hHHi!HHi!IHhI!HHHi!HHi!IHhI!hHHi!HHi!IHhI!hHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!iHHi!HHi!IHhI!hHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!!HHi!HHi!IHhI!hHHi!HHi!IHhI!hHHi!HHi!IHhI!hHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!iHHi!HHi!IHhI!hHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!!HHi!HHi!IHhI!HHHi!HHi!IHhI!HHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!HHHi!HHi!IHhI!HHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!IHHi!HHi!IHhI!HHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!HHHi!HHi!IHhI!HHHi!HHi!IHhI!iHHi!HHi!IHhI!!HHi!HHi!IHhI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhih!" + "'", str17, "hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str19, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str21, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str23, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str24, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!IhHI!IHI!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHhHhHI!IHI!!hhih!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str16, "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str17, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str18, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHI!HHI!IHhHhHI!IHI!!hhih!" + "'", str19, "hHI!HHI!IHhHhHI!IHI!!hhih!");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str2, "HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHI!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHI!" + "'", str2, "hHI!HHI!IHHI!");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!hHi!HHi!IH" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!hHi!HHi!IH");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!" + "'", str2, "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHi!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHi!");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str7, "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) -1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhih!" + "'", str13, "Hhhih!");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!ihhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IH", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str19, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str21, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str22, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str23, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHI!HHI!IH" + "'", str24, "hHI!HHI!IH");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str13, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        char[] charArray15 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!IhHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!hhi!ihhi!" + "'", str21, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str22, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str23, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!ihhI!hhI!ihhhhi!ihi!!!hhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!ihhI!hhI!ihhhhi!ihi!!!hhI!hhI!ihhhhi!ihi!!IhhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!hhhI!hhI!ihhhhi!ihi!!IhhI!hhI!ihhhhi!ihi!!!" + "'", str1, "hhhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!ihhI!hhI!ihhhhi!ihi!!!hhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!ihhI!hhI!ihhhhi!ihi!!!hhI!hhI!ihhhhi!ihi!!IhhI!hhI!ihhhhi!ihi!!HhhI!hhI!ihhhhi!ihi!!hhhI!hhI!ihhhhi!ihi!!IhhI!hhI!ihhhhi!ihi!!!");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHHhhi!ihi!!hhI!hhI!ihI!hhI!!", 0, (int) (short) 100, "Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHIHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHIHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!" + "'", str1, "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str13, "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhi!" + "'", str14, "Hhi!hhi!ihhi!");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHhi!hhi!ihhi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!" + "'", str2, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!IHI!!hhih!", (int) (short) -1, "hHHI!IHI!!HHI!HHI!IHI!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!IHI!!hhih!" + "'", str4, "hhHI!IHI!!hhih!");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhi!", 100, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhi!" + "'", str4, "Hhi!hhi!ihhi!");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!Hi!", (int) (short) 1, (int) ' ', "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!Hi!" + "'", str4, "hhhi!ihi!!Hi!");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str18, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHI!!" + "'", str19, "HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str20, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str21, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!", (int) (short) 1, "hhhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhih!hhhhih!hhhhih!ihhhih!!hhhih!ihhhih!hhhhih!ihhhih!!hhhih!!" + "'", str4, "hhhhih!hhhhih!hhhhih!ihhhih!!hhhih!ihhhih!hhhhih!ihhhih!!hhhih!!");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!", (int) (short) 1, (int) (short) -1, "hhHhhi!ihihHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!" + "'", str4, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str17, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!" + "'", str19, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", charArray7);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str14, "HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) '4', "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str4, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!" + "'", str16, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str18, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str14, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!" + "'", str1, "hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str2, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhi!ihi!!iHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!ihhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHI!IHI!!" + "'", str9, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str12, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str13, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhI!hhI!ihhi!" + "'", str10, "HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str11, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!" + "'", str20, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHI!IHI!!" + "'", str21, "HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!" + "'", str23, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str24, "HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!" + "'", str2, "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!" + "'", str1, "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (-1), "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!HHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!HHhHI!IHI!!hhih!" + "'", str1, "hHHHI!IHI!HHhHI!IHI!!hhih!");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!" + "'", str20, "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!" + "'", str21, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhih!hihhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHIH!HIHHHIH!H!" + "'", str1, "HHHHIH!HIHHHIH!H!");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhHHhi!ihi!!iHhi!ihi!!!", (int) (byte) -1, (-1), "HhHi!HHi!IHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!HHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!iHHIHhHi!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHi!IHi!HHHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!i!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhHHhi!ihi!!iHhi!ihi!!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhHHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (short) -1, 10, "hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!" + "'", str4, "Hhhi!hhi!ihhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str18, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!ihi!!" + "'", str9, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str11, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", 100, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!hhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!hhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!ihhi!hhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihhhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!hhi!hhi!ih" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!hhi!hhi!ih");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str16, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHhi!ihi!!iHhi!ihi!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str16, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str19, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHhi!ihi!!iHhi!ihi!!!" + "'", str20, "HHHhi!ihi!!iHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!" + "'", str21, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str22, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str19, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str21, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str23, "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str24, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIhhi!hhi!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!", (int) '4', (int) ' ', "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str17, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str19, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str20, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str13, "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!HHI!IHI!!HI!IHI!HHI!IHI!hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHIH!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHIH!" + "'", str12, "hHIH!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str13, "hHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!" + "'", str14, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHI!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHI!");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str7, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str8, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!" + "'", str9, "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!", 100, (int) '4', "HHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHIHHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!" + "'", str4, "hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHIHHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!" + "'", str1, "hHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhih!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!!hhih!" + "'", str14, "Hhhhi!ihi!!hhih!");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!HHhHI!IHI!!hhih!", 100, (int) (byte) 0, "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", 0, (int) (short) 100, "HHI!HHI!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IH" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IH");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHi!HHi!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", (-1), 100, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHi!HHi!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!" + "'", str4, "hhHi!HHi!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str13, "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!IHI!!" + "'", str13, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhi!" + "'", str14, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str16, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!" + "'", str2, "hHHI!IHI!!");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str1, "Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!", 100, "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str1, "HhI!hhI!ihHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str1, "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHI!" + "'", str1, "HHi!HHi!IHHI!");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHi!HHi!IH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        char[] charArray9 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str12, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihHhHhi!ihi!!HHIH!" + "'", str1, "hhi!hhi!ihHhHhi!ihi!!HHIH!");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!" + "'", str15, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str13, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str14, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hHI!HHI!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        char[] charArray15 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhI!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str21, "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str22, "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!" + "'", str23, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str24, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHHIH!HIHHHIH!H!HHHI!IHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHHIH!HIHHHIH!H!HHHI!IHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1, "hHI!HHI!IHHHHHIH!HIHHHIH!H!HHHI!IHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str19, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str21, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!" + "'", str23, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str12, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!hhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!hhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!hhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!hhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str14, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str15, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhI!hhI!ihHi!" + "'", str20, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhi!" + "'", str21, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHI!!" + "'", str22, "hHHI!IHI!!");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHI!IHI!!" + "'", str9, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str11, "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str13, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhhHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str18, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!" + "'", str19, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str22, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!", (int) (short) 1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!" + "'", str4, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!", (-1), (int) (byte) -1, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!" + "'", str4, "HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str1, "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str18, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        char[] charArray9 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!", (int) (short) 1, "hhHi!HHi!Ihhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str4, "hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhI!hhI!ihI!hhI!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str2, "hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str16, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!" + "'", str2, "hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHI!", 100, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHI!" + "'", str4, "hHI!HHI!IHHI!");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        char[] charArray9 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str13, "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str16, "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHI!IHI!HHI!!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str10, "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!" + "'", str1, "hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!IHHi!HHi!IHHHHI!IHI!!!HHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!hHHi!HHi!IHHHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!iHHi!HHi!IHHHHI!IHI!!!");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str21, "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!" + "'", str1, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!IhHI!IHI!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str14, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str16, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!" + "'", str1, "HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!Hhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!HHhhi!ihi!!ihhi!ihi!!!IHhhi!ihi!!ihhi!ihi!!!!Hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", (int) (byte) 100, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str4, "HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHI!HhI!hhI!ihHi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHI!HHI!HhI!hhI!ihHi!" + "'", str19, "hHHHI!HHI!HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str2, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IH", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IH" + "'", str16, "hHI!HHI!IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHi!HHi!IHi!HHi!!", (-1), (int) 'a', "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str4, "hHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", 1, (int) '#', "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str4, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }
}

