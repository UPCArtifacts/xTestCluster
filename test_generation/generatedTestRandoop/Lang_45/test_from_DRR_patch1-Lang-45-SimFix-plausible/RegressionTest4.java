import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (int) 'a', (int) (short) -1, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (int) (short) -1, (int) (short) 10, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!HhI!hhI!ihHi!" + "'", str4, "hHHHI!HHI!HhI!hhI!ihHi!");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhi!", (int) (short) 10, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!" + "'", str4, "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", (int) (short) -1, (int) '4', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi" + "'", str4, "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) 100, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str6, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str12, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!" + "'", str14, "hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) '#', (int) (short) 1, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!" + "'", str4, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhi!" + "'", str12, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!" + "'", str13, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!ihhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!!");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hi!", 0, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str4, "hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!", 1, (int) (byte) 10, "HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!HHI!HHi!HHi!IHHHHI!IHI!!" + "'", str4, "HhHHI!HHI!HHi!HHi!IHHHHI!IHI!!");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str14, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!IHI!!IhHI!IHI!!!", 100, "Hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!IHI!!IhHI!IHI!!!" + "'", str4, "HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        char[] charArray12 = new char[] { '4', 'a', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!" + "'", str20, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", (-1), "Hhhi!hhi!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str4, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str2, "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhih!", (int) (byte) 0, "hHHI!IHI!!HHi!HHi!IHi!HHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str4, "HhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str2, "hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhih!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!" + "'", str15, "Hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!" + "'", str17, "Hhhih!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!ihi!!" + "'", str7, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!", (int) '4', (-1), "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("h", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hHI!IHI!!" + "'", str6, "hHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        char[] charArray9 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHHi!HHi!IHi!HHi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str2, "HHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (short) 0, (int) (short) 10, "HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str4, "hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhih!" + "'", str19, "hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str21, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str22, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!" + "'", str1, "HHHI!IHI!!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str14, "hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!IhHI!IHI!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!" + "'", str16, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        char[] charArray12 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str2, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str16, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!" + "'", str1, "HHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhi!ihi!!iHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!IHI!!IhHI!IHI!!!" + "'", str1, "HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("H", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhIh!hIhHhIh!h!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhHhIh!hIhHhIh!h!" + "'", str9, "hhHhIh!hIhHhIh!h!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", (int) ' ', "HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!ihi!!" + "'", str14, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str15, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str13, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str13, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str18, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!HHi!IHHI!" + "'", str19, "HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HhHi!HHi!IHhI!", (int) '4', (int) ' ', "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) '#', (int) (short) -1, "hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str11, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str13, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        char[] charArray5 = new char[] { 'a', '#', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!hhih!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!" + "'", str6, "hI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihi!!hhih!" + "'", str7, "Hhhi!ihi!!hhih!");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhI!hhI!ihI!hhI!!" + "'", str1, "hhI!hhI!ihhhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!hI!", 1, "HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!" + "'", str4, "hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) ' ', (int) '#', "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str14, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHi!HHi!IHHHHI!IHI!!" + "'", str16, "hHi!HHi!IHHHHI!IHI!!");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", 100, (int) '4', "HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!", (int) 'a', 10, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str16, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (short) 100, (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!" + "'", str1, "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!", (int) (short) 100, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!" + "'", str4, "hHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str2, "hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!ihi!!iHhi!ihi!!!", (int) ' ', "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!ihi!!iHhi!ihi!!!" + "'", str4, "HHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str20, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhi!hhi!ihhi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhi!" + "'", str2, "hhi!hhi!ihhhi!hhi!ihhi!");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IH" + "'", str1, "HHI!HHI!IH");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHI!HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) -1, 10, "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhih!", (int) (byte) -1, (int) (short) -1, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhih!" + "'", str4, "hHhih!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str9, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str12, "hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str13, "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", 10, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", 0, 0, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHI!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHhi!ihi!!iHhi!ihi!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHhi!ihi!!iHhi!ihi!!!" + "'", str2, "HHHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str19, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str20, "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) '#', "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str20, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhi!hhi!ihhi!", (int) 'a', "HHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhi!" + "'", str4, "Hhi!hhi!ihhhi!hhi!ihhi!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str2, "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHI!HHI!IHHI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hI!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHi!HHi!IHhHI!HHI!IHHI!" + "'", str21, "hHi!HHi!IHhHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHI!!hI!" + "'", str22, "hHHI!IHI!!hI!");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhih!" + "'", str9, "hhih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!iHhi!ihi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str13, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hi!" + "'", str14, "hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str15, "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!IHI!!" + "'", str13, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhi!" + "'", str14, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhhih!hihhhih!h!hhhi!ihihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!i!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!" + "'", str17, "Hhi!hhi!ihhhhhih!hihhhih!h!hhhi!ihihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!i!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihI!hhI!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str2, "hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhih!" + "'", str8, "Hhih!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!ihi!!Hi!" + "'", str10, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str11, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!ihi!!" + "'", str14, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str16, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!HHI!IHHI!" + "'", str17, "HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str19, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhHi!HHi!IHi!HHi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!IHI!!" + "'", str16, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!Hi!", (int) (short) 0, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!Hi!" + "'", str4, "hhhi!ihi!!Hi!");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str11, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str12, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", 0, "Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHhi!ihi!!iHhi!ihi!!!", (int) (byte) 0, 0, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!iHhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str1, "HHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hi!" + "'", str1, "Hhhi!ihi!!hi!");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        char[] charArray11 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str16, "hHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhih!" + "'", str17, "hhhih!");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!" + "'", str2, "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", 1, (int) (byte) 10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!" + "'", str4, "hHi!HHi!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!HhHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHI!IHI!!" + "'", str15, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihhi!" + "'", str16, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str18, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str20, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str2, "hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ih", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str13, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhI!hhI!ih" + "'", str14, "hhI!hhI!ih");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        char[] charArray17 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str21, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str24, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str26, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str27, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str28, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!", (int) (short) 1, (int) '#', "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHI!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHHI!" + "'", str2, "HHi!HHi!IHHI!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!" + "'", str20, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str2, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HhHhIh!hIhHhIh!h!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str18, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhI!hhI!ihHi!" + "'", str20, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhHhIh!hIhHhIh!h!" + "'", str22, "HhHhIh!hIhHhIh!h!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str24, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (int) (short) -1, (int) (byte) -1, "hHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        char[] charArray10 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhih!" + "'", str14, "Hhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHI!IHI!!IhHI!IHI!!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", (-1), "hhi!hhi!ihHhI!hhI!ihhHI!HHI!IHHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str16, "Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhI!hhI!ihhi!!");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHhI!hhI!ihI!hhI!!" + "'", str1, "hHHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!", (int) 'a', "hhi!hhi!ih", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!hhi!hhi!ih!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhihhi!hhi!ih!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhhhi!hhi!ihi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!hhi!hhi!ih!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhihhi!hhi!ih!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhhhi!hhi!ihi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str14, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhi!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhi!" + "'", str12, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!" + "'", str2, "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHhHiH!HiHhHiH!H!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhHiH!HiHhHiH!H!" + "'", str12, "HHhHiH!HiHhHiH!H!");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!ihi!!" + "'", str11, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHhI!" + "'", str13, "hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str15, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str16, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) (byte) 1, (int) (byte) -1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHI!HHi!HHi!IHHHHI!IHI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str20, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str21, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", (int) ' ', "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str1, "hhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", (int) (byte) 0, 0, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!Hi!" + "'", str2, "hhhi!ihi!!Hi!");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) (short) -1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        char[] charArray10 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str15, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str15, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!" + "'", str16, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHIH!" + "'", str21, "hHIH!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str22, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhi!ihi!!" + "'", str10, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHi!HHi!IHhI!" + "'", str12, "hHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str14, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str15, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str12, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!ihi!!" + "'", str9, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!IHI!!" + "'", str11, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!" + "'", str12, "hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHi!HHi!IHi!HHi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str2, "hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", 10, "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!" + "'", str4, "hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhih!" + "'", str9, "Hhhih!");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", (int) '#', "HhI!hhI!ihI!hhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!" + "'", str4, "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhIHhI!hhI!ihI!hhI!!!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHIHhI!hhI!ihI!hhI!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHhI!hhI!ihI!hhI!!I!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHhI!hhI!ihI!hhI!!hhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!iHhI!hhI!ihI!hhI!!hi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!HhI!hhI!ihI!hhI!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!iHhI!hhI!ihI!hhI!!hi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!IHhI!hhI!ihI!hhI!!hhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (byte) 100, "Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhi!hhi!ihi!hhi!!", (int) ' ', "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!hhi!ihi!hhi!!" + "'", str4, "hHhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!ihi!!hhhi!hhhi!ihi!!ihi!!ihhi!hhhi!ihi!!ihi!!!hhi!hhhi!ihi!!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!ihi!!" + "'", str14, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str16, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!HHI!IHHI!" + "'", str17, "HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str2, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str10, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str12, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!" + "'", str13, "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHIH!" + "'", str14, "HHHIH!");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        char[] charArray8 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhI!hhI!ihI!hhI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str10, "Hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!iHhi!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str15, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str18, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhi!ihi!!iHhi!ihi!!!" + "'", str20, "hHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", (int) (short) 100, (int) (short) 10, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str4, "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str2, "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ih" + "'", str1, "hhi!hhi!ih");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HHI!IHI!!" + "'", str6, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) '4', "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str18, "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str17, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhI!hhI!ihHi!" + "'", str19, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhhHi!HHi!IHi!HHi!!" + "'", str21, "HhhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str22, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (byte) 10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (byte) 100, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) 'a', "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", (int) (short) 100, (int) (short) 10, "hHHI!IHI!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str4, "hhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!", 0, (int) (short) 100, "hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!" + "'", str4, "hHHI!IHI!!");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) 'a', (int) (byte) 10, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str4, "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (short) 1, 0, "hHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!" + "'", str4, "hhHIH!");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str15, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        char[] charArray9 = new char[] { 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHI!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHhi!ihi!!iHhi!ihi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHi!HHi!IHHI!" + "'", str14, "hHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str15, "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHhi!ihi!!iHhi!ihi!!!" + "'", str16, "HHHhi!ihi!!iHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) -1, "Hhhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhI!hhI!ihI!hhI!!" + "'", str1, "HhI!hhI!ihhhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ih" + "'", str1, "Hhi!hhi!ih");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) 10, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str11, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str22, "Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhih!" + "'", str8, "Hhih!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str10, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhi!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!hhI!ihhi!" + "'", str19, "hhI!hhI!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!ihi!!" + "'", str12, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str14, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str9, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str10, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!hhI!ihhi!" + "'", str11, "HhI!hhI!ihhi!");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str17, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str19, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str20, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", 0, (int) (short) 100, "HhhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhHI!IHI!!IhHI!IHI!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHI!IHI!!IhHI!IHI!!!" + "'", str16, "HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (byte) 10, (int) (short) -1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str18, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!", (int) (byte) 10, (int) (byte) 100, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str4, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (-1), (int) '#', "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!" + "'", str2, "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ih" + "'", str1, "Hhi!hhi!ih");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", 0, 10, "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihhHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!IHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!!i!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!!i!hhi!!" + "'", str1, "hhi!hhi!ihhHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihhHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!IHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!!i!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!!i!hhi!!");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI!IHI!!" + "'", str7, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str8, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str9, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!ihhi!ihi!!!", (int) (byte) -1, (int) '4', "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!ihhi!ihi!!!" + "'", str4, "Hhhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!" + "'", str1, "HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!hi!");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!HhHi!HHi!IHi!HHi!!" + "'", str1, "hhhi!ihi!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhHI!IHI!!hhih!", (int) (short) 0, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhHI!IHI!!hhih!" + "'", str4, "hHhHI!IHI!!hhih!");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!!hHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!ihHHI!IHI!!HHi!HHi!IHi!HHi!!hhHHI!IHI!!HHi!HHi!IHi!HHi!!!", (int) (short) 0, 0, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!" + "'", str1, "hHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str18, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str14, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str29, "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhih!" + "'", str30, "Hhhih!");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!", 1, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHi!HHi!IHHI!");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 100, 0, "HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!Hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!iHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhih!" + "'", str11, "Hhih!");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        char[] charArray14 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str19, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!" + "'", str1, "HhI!hhI!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHhi!hhi!ihhi!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str8, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHi!HHi!IHHHHI!IHI!!" + "'", str9, "hHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str10, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhi!" + "'", str11, "Hhi!hhi!ihhhi!hhi!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHHi!HHi!IHi!HHi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str2, "HHi!HHi!IHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHHI!IHI!!", (int) (short) 10, (int) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IH" + "'", str4, "hHi!HHi!IH");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!", (int) ' ', (-1), "hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str4, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!" + "'", str2, "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str17, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str14, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str15, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str16, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhi!" + "'", str13, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str15, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHiH!HiHhHiH!H!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str16, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!" + "'", str17, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str19, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhHiH!HiHhHiH!H!" + "'", str20, "HHhHiH!HiHhHiH!H!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhI!hhI!ihHi!" + "'", str18, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str19, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str20, "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!" + "'", str16, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str17, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", 1, 100, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!" + "'", str18, "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!", 100, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!" + "'", str4, "Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str13, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!" + "'", str14, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        char[] charArray14 = new char[] { '#', '#', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str23, "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", (int) ' ', "hHhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!" + "'", str4, "hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) 'a', "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi" + "'", str2, "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhI!hhI!ihhi!" + "'", str10, "HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHhHhHI!IHI!!hhih!", (int) ' ', (int) '4', "Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHhHhHI!IHI!!hhih!" + "'", str4, "HHI!HHI!IHhHhHI!IHI!!hhih!");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!" + "'", str1, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!ihi!!" + "'", str9, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH" + "'", str10, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!IhHI!IHI!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHhi!hhi!ihhi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str12, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHHhi!hhi!ihhi!" + "'", str13, "hHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!", (int) (short) -1, "HHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!iHhi!ihi!!!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str11, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) '4', (int) 'a', "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str13, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhI!hhI!ihhi!" + "'", str14, "hhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        char[] charArray16 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str20, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str23, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str25, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", 0, "HHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str4, "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhi!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhi!");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!" + "'", str1, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhih!", (int) 'a', 1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        char[] charArray9 = new char[] { 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHhHI!IHI!!hhih!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hihhhih!h!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str12, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str13, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhi!" + "'", str14, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHhHI!IHI!!hhih!" + "'", str15, "HHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!ihi!!", (int) (short) 10, (int) ' ', "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!ihi!!" + "'", str4, "hhi!ihi!!");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhI!hhI!ihHi!" + "'", str13, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        char[] charArray12 = new char[] { '4', 'a', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str17, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str18, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str19, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHHHI!IHI!!" + "'", str1, "hHi!HHi!IHHHHI!IHI!!");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!" + "'", str1, "HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhi!ihi!!" + "'", str6, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        char[] charArray14 = new char[] { '#', '#', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str23, "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str25, "HhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!IHI!!" + "'", str12, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHi!HHi!IHHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!" + "'", str14, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str14, "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", 100, (int) ' ', "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str17, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!ihi!!hi!" + "'", str19, "hhhi!ihi!!hi!");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray6);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!IHI!!" + "'", str12, "hHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str12, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str14, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", (int) (byte) 0, (int) (byte) 0, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str2, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str1, "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!HI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str14, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ih", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ih" + "'", str2, "hhI!hhI!ih");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!HHI!HHi!HHi!IHHHHI!IHI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!" + "'", str9, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhHHI!HHI!HHi!HHi!IHHHHI!IHI!!" + "'", str10, "hhHHI!HHI!HHi!HHi!IHHHHI!IHI!!");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str2, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", (int) (short) 1, (int) (short) 10, "hHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "hHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!HhHi!HHi!IHi!HHi!!", (int) (byte) 100, (int) (short) -1, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!HhHi!HHi!IHi!HHi!!" + "'", str4, "hhhi!ihi!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", (int) (short) 0, (int) (byte) 1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str18, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str19, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("h", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str6, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!" + "'", str16, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) 0, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhHiH!HiHhHiH!H!", 0, (int) (short) 1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!", 0, "HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!" + "'", str2, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!" + "'", str18, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str11, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str13, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!IhHI!IHI!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str13, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        char[] charArray9 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", (int) (short) -1, "Hhi!hhi!ihhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str4, "Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihh" + "'", str1, "Hhi!hhi!ihh");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "HHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhih!" + "'", str11, "hhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str12, "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!" + "'", str13, "Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHi!HHi!IHhI!" + "'", str15, "HHi!HHi!IHhI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str18, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!" + "'", str2, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str14, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHI!HHI!IHHHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHI!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHI!");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!" + "'", str2, "hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhhih!hihhhih!h!hhhi!ihihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!i!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhhi!ihi!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        char[] charArray9 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 0, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hi!" + "'", str15, "Hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhi!" + "'", str16, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str18, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (int) (short) 1, "HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str1, "Hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihhHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!IHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!!i!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!!i!hhi!!", 0, (int) (byte) -1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihhHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!IHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!!i!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!!i!hhi!!" + "'", str4, "hhi!hhi!ihhHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!hhhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihi!!hHHHIH!HIHHHIH!H!!hhi!ihi!!hHHHIH!HIHHHIH!H!ihhi!ihhHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!IHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!HHHhHHHIH!HIHHHIH!H!I!IHI!!iHHhHHHIH!HIHHHIH!H!I!IHI!!!HHhHHHIH!HIHHHIH!H!I!IHI!!!i!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!hhhi!ihi!hHHHIH!HIHHHIH!H!!ihhi!ihi!hHHHIH!HIHHHIH!H!!!hhi!ihi!hHHHIH!HIHHHIH!H!!!i!hhi!!");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihI!hhI!!", (int) (short) -1, (int) 'a', "hHhi!ihi!!iHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str4, "HhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhih!" + "'", str9, "hhih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!IHI!!IhHI!IHI!!!", 0, (int) (byte) 1, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str7, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str9, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", (int) (short) 0, (int) (byte) 0, "HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!" + "'", str4, "HHI!HHI!IHHhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!HHHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHI!!Hhhhih!hihhhih!h!!HHI!IHI!!Hhhhih!hihhhih!h!IHHI!IHHhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!ihhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!hhhHhhhih!hihhhih!h!i!ihi!!IhhHhhhih!hihhhih!h!i!ihi!!!hhHhhhih!hihhhih!h!i!ihi!!!I!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!HHHI!IHI!Hhhhih!hihhhih!h!!IHHI!IHI!Hhhhih!hihhhih!h!!!HHI!IHI!Hhhhih!hihhhih!h!!!I!HHI!!");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!Hi!", 0, (int) (short) -1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!Hi!" + "'", str4, "Hhhi!ihi!!Hi!");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi" + "'", str2, "hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!", 0, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str4, "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", (int) (short) 100, "HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str4, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray9);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhi!" + "'", str18, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str11, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str12, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhi!" + "'", str13, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str15, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!hhI!hhI!ihI!hhI!!", 10, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str4, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhI!hhI!ihhHI!HHI!IHHI!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhI!hhI!ihhHI!HHI!IHHI!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhI!hhI!ihhHI!HHI!IHHI!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhI!hhI!ihhHI!HHI!IHHI!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhi!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhi!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!" + "'", str1, "HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (-1), (int) (short) 0, "hhhi!ihi!!Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str8, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhi!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHI!IHI!!" + "'", str19, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhi!" + "'", str20, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!" + "'", str22, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (byte) -1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str12, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihi!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihhhi!hhi!ihi!hhi!!" + "'", str11, "hhi!hhi!ihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHhHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHhHhHI!IHI!!hhih!" + "'", str1, "HHI!HHI!IHhHhHI!IHI!!hhih!");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!iHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHIH!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!IHI!!" + "'", str16, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHIH!" + "'", str17, "hHIH!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str2, "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) '4', (int) (byte) -1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str2, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        char[] charArray9 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!", (int) (byte) -1, (int) ' ', "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str4, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!" + "'", str1, "HHhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHhi!ihi!!iHhi!ihi!!!", (int) ' ', "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhi!ihi!!iHhi!ihi!!!" + "'", str4, "hHHhi!ihi!!iHhi!ihi!!!");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
    }
}

