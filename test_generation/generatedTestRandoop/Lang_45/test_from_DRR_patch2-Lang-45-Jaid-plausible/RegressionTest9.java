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
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhHhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiH!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihiH!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!H!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!hhHIHhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhih!" + "'", str10, "Hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str12, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhih!hhhihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str15, "Hhhih!hhhihhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhih!" + "'", str10, "hhih!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str9, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str11, "hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!hhI!ihI!hhI!!" + "'", str11, "HhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        char[] charArray6 = new char[] { '4', 'a', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str9, "hhhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        char[] charArray7 = new char[] { 'a' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHhHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str9, "hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str10, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh" + "'", str11, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHI!" + "'", str12, "hHI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str13, "Hhhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str21, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str22, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHIH!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHIH!" + "'", str2, "HHHIH!");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        char[] charArray11 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str15, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str17, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!" + "'", str9, "hHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!IHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!HHHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!" + "'", str10, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHI!IHI!!" + "'", str11, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str12, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "hhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIhhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHHhI!hhI!ihHhhi!ihi!!hhhi!ihi!!IhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!iHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihiHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihh!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhI!hhI!ihI!hhI!!" + "'", str1, "HHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!H", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str1, "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 0, 10, "hHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!hHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!" + "'", str4, "HHHHI!IHI!hHhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str19, "hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhhI!hhI!ihHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str12, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str16, "HhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHIH!", charArray7);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHI!IHI!!HHHIH!" + "'", str14, "hHHI!IHI!!HHHIH!");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!", 10, "hHhih!HHhih!HHhih!IHhih!!Hhih!IHhihHhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!ihHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!hhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!IhHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!hHIH!hhHIH!hhHIH!ihHIH!!hHIH!ihHIH!hhHIH!ihHIH!!hHIH!!hHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        char[] charArray11 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str16, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!HHhih!HHhih!IHhih!!Hhih!IHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!ihhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!!hhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!ihhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!!hhi!" + "'", str2, "Hhhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!ihhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihi!hhi!!!!hhi!");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        char[] charArray12 = new char[] {};
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHHHi!HHi!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!hhi!ihi!hhi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str21, "Hhhhi!ihi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!hhi!ihi!hhi!!" + "'", str24, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!" + "'", str14, "HHi!HHi!IHhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!" + "'", str16, "Hhhih!hhhih!hhhih!ihhih!!hhih!ihhhi!hhi!ihhhhi!ihi!!hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }
}

