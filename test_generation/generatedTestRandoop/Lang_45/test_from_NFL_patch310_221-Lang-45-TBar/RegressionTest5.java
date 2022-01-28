import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!ihi!!" + "'", str14, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI" + "'", str16, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str11, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", (int) (short) 1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!ihi!!hhi!hhi!ihi!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str9, "hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str10, "HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!", 0, (int) (byte) -1, "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!" + "'", str4, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (int) (short) -1, (int) 'a', "Hhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihHhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str4, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihHhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI!IHI!!" + "'", str7, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str9, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhih!" + "'", str11, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!IHI!hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 0, (int) (byte) 1, "hhI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!" + "'", str4, "hhhI!");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!" + "'", str1, "HHi!HHi!IHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhI!hhI!ihI!hhI!!", (int) (short) 0, (int) (byte) 0, "Hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhih!" + "'", str4, "Hhi!hhi!ihhhih!");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHIH!HHHIHHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhi!ihi!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!" + "'", str1, "Hhhih!hhhihhhhi!ihi!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh" + "'", str1, "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", 0, (int) (short) -1, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!" + "'", str2, "hHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str6, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str7, "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", 0, "HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) 100, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!IHI!!" + "'", str13, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str15, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str16, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str20, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", 10, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str4, "HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str14, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str17, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIHHHHI!IHI!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIHHHHI!IHI!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!" + "'", str1, "HHHIH!HHHIHHHHI!IHI!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", (-1), (int) (short) 0, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        char[] charArray14 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!ihHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!ihi!!" + "'", str20, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str21, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!" + "'", str24, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhih!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhih!" + "'", str2, "hhi!hhi!ihhhih!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str17, "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str9, "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str10, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhiHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str16, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhiHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhiHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", (int) (byte) -1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str4, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str15, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhi!ihi!!" + "'", str9, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str11, "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str12, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!" + "'", str13, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str15, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str16, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!" + "'", str2, "hHHIH!");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", (int) '4', (int) (byte) -1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str4, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        char[] charArray11 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str15, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) -1, (int) ' ', "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHi!HHi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str15, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!" + "'", str1, "HHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!", 100, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!" + "'", str4, "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) -1, (int) (byte) 1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!" + "'", str4, "HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        char[] charArray6 = new char[] { '4', 'a', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str9, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHhI!hhI!ihI!hhI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhI!hhI!ihI!hhI!!" + "'", str14, "hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", (int) (short) 100, (int) (byte) 10, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        char[] charArray12 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str16, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str16, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str17, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", (int) (byte) -1, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str4, "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhih!" + "'", str1, "Hhhi!ihi!!hhhih!");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 0, (int) (short) 100, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!" + "'", str1, "hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!" + "'", str22, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
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
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (byte) -1, "hHHHI!IHI!hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhiHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhiHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!" + "'", str1, "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhiHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", (int) 'a', "Hhhi!ihi!!hHHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!Hhhi!ihi!!hHHIH!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHhhi!ihi!!hHHIH!!IHH" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!Hhhi!ihi!!hHHIH!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHIHhhi!ihi!!hHHIH!!IHH");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) '4', "HHhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hHHhi!hhi!ihi!hhi!!hhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhiHHhi!hhi!ihi!hhi!!!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHHhi!hhi!ihi!hhi!!!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hHHhi!hhi!ihi!hhi!!hhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhiHHhi!hhi!ihi!hhi!!!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHHhi!hhi!ihi!hhi!!!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str7, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHI!IHI!!");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str10, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str14, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str16, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str19, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str12, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str15, "hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) 0, (int) ' ', "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!" + "'", str4, "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH", (int) 'a', "hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH" + "'", str4, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhhih!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhih!" + "'", str9, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str10, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str2, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!" + "'", str2, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        char[] charArray15 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str20, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str22, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str23, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str18, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI", charArray11);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!IHI!!" + "'", str17, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI" + "'", str22, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 10, (int) '#', "hhhih!hhhihhhi!ihi!!hhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!HHhiHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!HHhiHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hHhih!HHhiHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (int) (byte) 0, (int) 'a', "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str4, "HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!ihi!!" + "'", str15, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str9, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str10, "HhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) (byte) 100, "HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhihhhhi!ihi!!hhi!hhi!ihi!hhi!!", (-1), (int) 'a', "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hHHIH!" + "'", str1, "hhhi!ihi!!hHHIH!");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", (int) (byte) -1, 10, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str4, "HHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!IHI!!" + "'", str16, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str18, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str20, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHI!HHI!IHI!HHI!!", (int) (byte) -1, "hhhi!ihi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "hHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str17, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!" + "'", str20, "hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (byte) 1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!" + "'", str2, "HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str8, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str9, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        char[] charArray14 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!ihi!!" + "'", str20, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str21, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str22, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str24, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str2, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!", (-1), (int) (byte) 1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str4, "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!h", 1, 0, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", (int) (short) 10, (int) (short) 0, "hHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!hHi!HHi!IHi!HHi!!" + "'", str4, "HHHI!IHI!!hHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str17, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str18, "HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        char[] charArray9 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!IHI!!" + "'", str10, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!IHI!!" + "'", str11, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str12, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str14, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhhhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhhhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!" + "'", str2, "HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhhhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhih!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhih!" + "'", str15, "Hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str16, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) ' ', (int) 'a', "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHHI!IHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", (int) (short) -1, (int) (short) 100, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!Hhi!ihi!!" + "'", str4, "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!Hhi!ihi!!");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!hhi!ihi!hhi!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) 'a', "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) 'a', "HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!!hhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!!hhi!hhi!ihi!hhi!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str13, "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str17, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (byte) -1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!!", (int) (byte) 100, (int) (byte) 10, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
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
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str2, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str10, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str11, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str1, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str2, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!" + "'", str2, "HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str2, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str2, "HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI", 100, "HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI" + "'", str4, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH" + "'", str1, "Hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!hHi!HHi!IHi!HHi!!" + "'", str1, "hHHI!IHI!!hHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!hhih!", (int) (short) 0, (int) (byte) 0, "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!!" + "'", str4, "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", (int) 'a', 0, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!Hhhih!" + "'", str4, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!Hhhih!");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 0, (int) (short) 1, "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!" + "'", str4, "HHi!");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str1, "HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str20, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str21, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!" + "'", str22, "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray5);
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
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!", (int) (short) -1, (int) (byte) -1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!" + "'", str4, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHIH!" + "'", str1, "hHHI!IHI!!HHHIH!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hI!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str18, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!Hhhih!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!Hhhih!" + "'", str2, "HHHI!IHI!!Hhhih!");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (byte) 1, (int) (short) 10, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!hhHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhHIH!hhHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str14, "HHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str17, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str20, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhiHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihiHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str2, "Hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI", (int) (short) 0, (int) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str11, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str12, "HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!" + "'", str1, "HhhI!");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str8, "HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str9, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str10, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhi", 100, (int) (short) -1, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhi" + "'", str4, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhi");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "hHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!ihhi!HHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihIhhi!!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!hhi!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhhi!hI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!hhi!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!Hhhi!HHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHhhi!I!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!hhi!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IHHI!hhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHiHHI!!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!HHI!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHHI!Hi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!HHI!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hHHI!hhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhHHI!i!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHI!ihi!!hhhHi!HHi!IHi!HHi!!!" + "'", str1, "HhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IHHI!hhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHiHHI!!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!HHI!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHHI!Hi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!HHI!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hHHI!hhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhHHI!i!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHI!ihi!!hhhHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!iHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!iHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "Hhhi!hhi!iHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str16, "hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhi!hhi!ihi!hhi!!" + "'", str17, "HHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!" + "'", str16, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str15, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!" + "'", str18, "Hhhih!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!Hhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!Hhhih!" + "'", str1, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!Hhhih!");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        char[] charArray9 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str10, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHI!IHI!!" + "'", str11, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str12, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!ihi!!hhi!hhi!ihi!hhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "HHhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHIH!" + "'", str16, "HHIH!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str19, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHIhhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHIhhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!" + "'", str2, "hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHIhhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhhHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhhHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        char[] charArray8 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str12, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str1, "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHIHHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhHHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!I!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihihhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHhhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!i!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!" + "'", str1, "HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihihhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHhhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!i!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!Hhhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str19, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhih!" + "'", str21, "hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!" + "'", str24, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!", 100, (int) (byte) -1, "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHiHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!" + "'", str4, "hhhih!");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHhhhi!ihi!!HHi!HHi!IHi!HHi!!I!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!HHi!HHi!IHi!HHi!!i!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhhi!ihi!!HHi!HHi!IHi!HHi!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihhhhi!ihi!!HHi!HHi!IHi!HHi!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!hhhi!ihi!!HHi!HHi!IHi!HHi!!!!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str15, "hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!IHI!!" + "'", str10, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str11, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHIH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhih!" + "'", str2, "Hhhi!ihi!!hhhih!");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", (int) (short) 1, (int) (byte) 0, "hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH" + "'", str4, "Hhhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 1, (int) (short) 10, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray7);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!!", (int) (byte) 100, 100, "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str4, "hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IhhI!hhI!ihI!hhI!!HI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IhhI!hhI!ihI!hhI!!HI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (short) 100, "HHHI!HHI!IHI!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (byte) 100, 0, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str18, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!" + "'", str20, "Hhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str21, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str22, "HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) -1, (int) (byte) 0, "hHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!HHIH!" + "'", str1, "hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!HHIH!");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!" + "'", str10, "Hhhih!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str9, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhHIH!hhHIHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str11, "HhHIH!hhHIHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        char[] charArray13 = new char[] { '4', 'a', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!", charArray13);
        java.lang.Class<?> wildcardClass24 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str21, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str15, "hHHHI!IHI!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str16, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str1, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", (int) ' ', (int) (short) 1, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!h" + "'", str4, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!h");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH", (int) 'a', "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHhHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHhHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HI!IHI!!HH" + "'", str4, "hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHhHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHhHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HI!IHI!!HH");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str9, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!" + "'", str10, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) -1, "hI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!ihI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!!hI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!ihI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!!hI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!ihI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!" + "'", str4, "HhI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!ihI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!!hI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!ihI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!!hI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!ihI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!hI!hhI!hhI!hhI!ihI!!hI!ihI!hhI!ihI!!hI!!");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!" + "'", str10, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!", (int) (short) 1, (int) '#', "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!" + "'", str4, "hhhih!");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!", (int) (short) 10, 1, "Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "Hhhhi!hhi!Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!" + "'", str1, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", (-1), "hHi!HHi!IHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!Hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str12, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str14, "HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (byte) 10, (int) '#', "Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!" + "'", str4, "hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray8);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str14, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str16, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!" + "'", str1, "Hhhi!");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", (int) '4', (int) (short) -1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "HHHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str18, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str21, "hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str22, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        char[] charArray6 = new char[] { '#', '#', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str12, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str13, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!" + "'", str14, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhiHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!" + "'", str1, "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str6, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh" + "'", str1, "hHHHI!HHI!hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!", (int) (byte) 1, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str2, "hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        char[] charArray12 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str19, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh!");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str12, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi" + "'", str13, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhi!hhi!ihHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!" + "'", str2, "HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        char[] charArray9 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hI!", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        char[] charArray8 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str21, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str22, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH", (int) (byte) 10, "hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str4, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi" + "'", str12, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("HI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str7, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str10, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str12, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhih!HHhihHHI!IHI!!Hhhih!", (int) ' ', "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhih!HHhihHHI!IHI!!Hhhih!" + "'", str4, "HHhih!HHhihHHI!IHI!!Hhhih!");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!", (-1), "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhiHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!IHI!!" + "'", str12, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str13, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhiHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str14, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhiHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        char[] charArray6 = new char[] { '4', 'a', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str2, "hHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str19, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhI!" + "'", str21, "HhI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str22, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhih!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhih!" + "'", str12, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhhih!" + "'", str13, "hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!!", (int) (byte) 1, (int) '4', "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!hhI!hhI!ihI!hhI!!" + "'", str4, "HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhih!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhih!" + "'", str2, "Hhhi!ihi!!hhhih!");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!", (int) (byte) 1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!" + "'", str4, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!", (int) (byte) 0, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!" + "'", str4, "hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str9, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!IHI!!" + "'", str10, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str13, "hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) 1, 0, "HHHHI!IHI!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHI!IHI!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HHHHHI!IHI!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str13, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray8);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!IHI!!" + "'", str14, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str16, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("h", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hhhih!" + "'", str5, "hhhih!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str6, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str14, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHIHHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhHHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!I!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihihhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHhhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!i!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!" + "'", str1, "hhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihihhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHhhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!i!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH!");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (byte) -1, (-1), "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhih!" + "'", str9, "Hhih!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str10, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str11, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str12, "hHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hI!" + "'", str19, "hI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI" + "'", str20, "hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str1, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str20, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str21, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str14, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str13, "HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!!" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!hhhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!" + "'", str1, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!", (int) (short) 1, "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str19, "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str20, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str2, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        char[] charArray13 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray13);
        java.lang.Class<?> wildcardClass23 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str20, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str22, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("H", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!IHI!!" + "'", str21, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str22, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str23, "hHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str24, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!IHI!!" + "'", str16, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str18, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHI!IHI!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "hhI!hhI!ihHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) 'a', (int) '4', "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str4, "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!", (int) 'a', (int) (short) 10, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!" + "'", str4, "hHi!");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihHhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihHhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str10, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihHhhhi!ihi!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 0, "HhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) ' ', (int) (short) 0, "hHi!HHi!IHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!IHI!!" + "'", str13, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!HHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!IHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!HHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!IHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!HHI!" + "'", str1, "HHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!HHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!IHHI!IHI!!HhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!HHI!");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str15, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", 100, 1, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!" + "'", str4, "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", 0, "hhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihihhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHhhhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!i!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!ihhi!HHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihIhhi!!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!hhi!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhhi!hI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!hhi!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!Hhhi!HHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHhhi!I!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!hhi!IHI!!HHHhI!hhI!ihI!hhI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str15, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!ihhi!HHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihIhhi!!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!hhi!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhhi!hI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!hhi!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!Hhhi!HHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHhhi!I!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!hhi!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str16, "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!ihhi!HHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihIhhi!!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!hhi!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhhi!hI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!hhi!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!Hhhi!HHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHhhi!I!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!hhi!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str21, "HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hHHIH!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!ihi!!hHHIH!" + "'", str17, "hhhi!ihi!!hHHIH!");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!HHHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str15, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHIHHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhHHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!I!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str19, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hHI!IHI!!" + "'", str7, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHI!IHI!!" + "'", str8, "hHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!ihi!!" + "'", str9, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str10, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!" + "'", str1, "hhI!hhI!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", (int) 'a', "hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!HHi!IHhHIH!", (int) ' ', "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHhHIH!" + "'", str4, "hHi!HHi!IHhHIH!");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str16, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!IHI!!" + "'", str10, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str11, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str12, "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str13, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        char[] charArray7 = new char[] { '4', 'a', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!IHI!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str9, "Hhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str10, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHI!IHI!!" + "'", str9, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!" + "'", str10, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhhi!ihi!!hhhih!", (int) '#', (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHI!HHI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHI!HHI!!" + "'", str2, "HHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str18, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!", (int) (short) 1, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!" + "'", str4, "Hhi!");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!", 100, "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!" + "'", str4, "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHI!HHI!IHI!HHI!!HI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!IHI!!" + "'", str18, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str20, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str21, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str22, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHI!HHI!IHI!HHI!!HI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str24, "HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHI!HHI!IHI!HHI!!HI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        char[] charArray13 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHIH!" + "'", str20, "HHHIH!");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", (int) (byte) 0, (-1), "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HHHI!IHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhiHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!IHI!!" + "'", str14, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhiHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhiHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str16, "HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!IHI!!" + "'", str10, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str11, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", (int) (byte) 1, (int) (short) 1, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str4, "HhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi" + "'", str1, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str9, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!IHI!!" + "'", str10, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str2, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhihhhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) (short) -1, (int) '4', "Hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihHhi!hhi!ihhhih!" + "'", str4, "Hhhih!hhhihhhhi!ihi!hhhih!hhhih!hhhih!ihhih!!hhih!ihHhi!hhi!ihhhih!");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIHhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihHhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!hhhihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str17, "Hhhih!hhhihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihhhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str18, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihhhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!" + "'", str2, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str1, "HHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhiHHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhi!hhi!ihi!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhi!hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihHhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str9, "HhHIH!hhHIhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihHhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str10, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihHhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhi!ihi!!" + "'", str9, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str11, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!" + "'", str13, "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str14, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!HHI!!HHHHI!HHI!IHI!hHHHI!HHI!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!" + "'", str2, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI!IHI!!" + "'", str7, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str9, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!iHHi!HHi!IHi!HHi!!hi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!" + "'", str1, "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!Hhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str7, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihhhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str13, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhhhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhhhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!" + "'", str1, "hHhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhhhhhi!hhi!hhhi!ihi!!hhi!hhi!ihi!HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!!");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhIhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!" + "'", str2, "hHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIh!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIh!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!h!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str14, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str17, "hhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHHI!IHI!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!", (int) '#', (-1), "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!IHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!HHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!iHhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!Hhih!HHhih!HHhih!IHhih!!Hhih!IHhih!HHhih!IHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!" + "'", str4, "HHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str20, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHIH!" + "'", str22, "hHHIH!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str24, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!" + "'", str2, "HHi!");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str15, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!" + "'", str16, "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str1, "hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", (int) (byte) -1, 0, "HhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!" + "'", str4, "HhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH", (int) 'a', (-1), "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH" + "'", str4, "hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!", 0, "hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh" + "'", str1, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hh");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhiHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str21, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhhi!hhi!ihhHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhiHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str22, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhiHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!ihhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str1, "HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!" + "'", str16, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!", 10, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "hhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!" + "'", str15, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!HHhihHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHhhhi!ihi!!HHi!HHi!IHi!HHi!!I!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!HHi!HHi!IHi!HHi!!i!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhhi!ihi!!HHi!HHi!IHi!HHi!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihhhhi!ihi!!HHi!HHi!IHi!HHi!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!hhhi!ihi!!HHi!HHi!IHi!HHi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHhhhi!ihi!!HHi!HHi!IHi!HHi!!I!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!HHi!HHi!IHi!HHi!!i!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhhi!ihi!!HHi!HHi!IHi!HHi!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihhhhi!ihi!!HHi!HHi!IHi!HHi!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!hhhi!ihi!!HHi!HHi!IHi!HHi!!!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHhhhi!ihi!!HHi!HHi!IHi!HHi!!I!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!ihi!!HHi!HHi!IHi!HHi!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!HHi!HHi!IHi!HHi!!i!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhhi!ihi!!HHi!HHi!IHi!HHi!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihhhhi!ihi!!HHi!HHi!IHi!HHi!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!hhhi!ihi!!HHi!HHi!IHi!HHi!!!!");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!IHI!!" + "'", str13, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str15, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str16, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!Hhhih!", (int) (byte) 0, (int) '4', "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHIhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!Hhhih!" + "'", str4, "HHHI!IHI!!Hhhih!");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str18, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str21, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str22, "hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!hHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!hi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!HHhihHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihI!hhI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH" + "'", str13, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str14, "Hhhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str15, "hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhi!ihi!!" + "'", str10, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "hhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHIhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str9, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", 0, (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!I" + "'", str4, "hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!I");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhih!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihih!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!h!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str1, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!iHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!iHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "Hhhi!hhi!iHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!IHI!!" + "'", str16, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhih!" + "'", str18, "hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!" + "'", str19, "hhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHIhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHH!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        char[] charArray10 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str15, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str2, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhihhhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str9, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str10, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str14, "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!", charArray7);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!" + "'", str14, "hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

