import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hHHI!IHI!!HHi!HHi!IHi!HHi!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", (-1), "hHHHI!IHI!HHhHI!IHI!!hhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str4, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        char[] charArray11 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihi!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str10, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str11, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        char[] charArray9 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str12, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!" + "'", str13, "hHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str14, "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhhi!ihi!!hhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhih!" + "'", str17, "hhi!hhi!ihhhhhi!ihi!!hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!hhi!hhi!ih!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhihhi!hhi!ih!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhhhi!hhi!ihi!!!hhi!!ihhi!hhi!ihi!hhi!!!", (int) 'a', "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!hhi!hhi!ih!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhihhi!hhi!ih!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhhhi!hhi!ihi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!hhi!hhi!ih!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhihhi!hhi!ih!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhhhi!hhi!ihi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", (int) (short) 10, (int) ' ', "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!" + "'", str2, "HHHI!IHI!!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hI!");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        char[] charArray6 = new char[] { 'a' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHI!IHI!!" + "'", str8, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str10, "HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str11, "HhI!hhI!ihHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!HHi!IHHhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "hhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhIHHI!HHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!iHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!", (int) (byte) 10, 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IH" + "'", str4, "HHI!HHI!IH");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHHIH!HIHHHIH!H!HHHI!IHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHIHHHHI!IHI!!HHHI!IHI!!HHI!HHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHHIH!HIHHHIH!H!HHHI!IHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHIHHHHI!IHI!!HHHI!IHI!!HHI!HHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!!!" + "'", str2, "HHI!HHI!IHHHHHIH!HIHHHIH!H!HHHI!IHIHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHIHHHHI!IHI!!HHHI!IHI!!HHI!HHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!HHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!I!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHIHHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!!!");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!HHi!IHHHHI!IHI!!" + "'", str14, "HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str16, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str18, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str20, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str21, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str22, "Hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!IHI!!" + "'", str18, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        char[] charArray6 = new char[] { '4', 'a', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhih!" + "'", str11, "hhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!IHHI!IHI!!HI!", (int) (byte) 100, 0, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str4, "HhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!IHI!!IhHI!IHI!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str16, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str17, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str20, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str19, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str22, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihHhHhi!ihi!!HHIH!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihHhHhi!ihi!!HHIH!" + "'", str2, "hhi!hhi!ihHhHhi!ihi!!HHIH!");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihhi!" + "'", str11, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhi!ihi!!Hi!" + "'", str12, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHi!HHi!IHi!HHi!!", 1, (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str4, "hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!Ihhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhI!hhI!ihI!hhI!!" + "'", str15, "hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!Ihhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str18, "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!Ihhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        char[] charArray11 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!ihi!!" + "'", str14, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str16, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str13, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!" + "'", str15, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        char[] charArray11 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHI!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhihhhih!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhhhhih!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhih!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhihhhih!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhhhhih!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhihhhih!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhhhhih!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhih!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhihhhih!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhhhhih!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!" + "'", str18, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhihhhih!!hhhhi!hhi!ihhhi!hhi!ihhi!hi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhhhhih!i!ihi!!ihhi!hhi!hhi!ihhi!!hhihhi!hhi!ihhhi!hhi!ihhi!!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhih!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhhi!hhi!ihhhi!hhi!ihhi!hi!ihhhhi!ihi!!hhhihhhih!!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhihhi!hhi!ihhhi!hhhhhih!i!ihhi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!iHhi!ihi!!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!" + "'", str20, "Hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!!hhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!hhhhhi!ihi!!ihhi!ihi!!!ihhhhi!ihi!!ihhi!ihi!!!!");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str14, "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str16, "hHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!" + "'", str1, "hHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHi!HHi!IHi!HHi!!", (int) ' ', (int) '4', "HhHHI!HHI!HHi!HHi!IHHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str4, "hHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        char[] charArray9 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str12, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str13, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHHI!IHI!!IHHI!IHI!!!", (int) (short) 1, (int) 'a', "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str13, "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str1, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", 10, "HhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!i!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHHI!IHI!!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHHI!IHI!!");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("H", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHhHI!HHI!IHHI!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!hI!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHI!IHI!!hI!" + "'", str22, "HHHI!IHI!!hI!");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!" + "'", str1, "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!IhHI!IHI!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHi!HHi!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!IHI!!" + "'", str14, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str15, "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str16, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str17, "Hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str15, "hHi!HHi!IHhHi!HHi!IHhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHHhI!hhI!ihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!ihhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", 1, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "HHhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHIHHHI!HHI!IHI!HHI!!" + "'", str1, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHIHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHHI!IHI!!");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhi!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str20, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHHI!" + "'", str21, "HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhi!" + "'", str22, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str23, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!iHhi!ihi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHHI!HHI!IHI!HHI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str13, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHhhi!hhi!ihi!hhi!!" + "'", str15, "hHhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", 10, (int) (byte) 10, "hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "Hhhhi!ihi!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        char[] charArray7 = new char[] { '#', '#', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str11, "Hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "HHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhih!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhih!" + "'", str16, "Hhhi!ihi!!hhih!");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhih!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHhHhHI!IHI!!hhih!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str13, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str15, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!HHI!IHhHhHI!IHI!!hhih!" + "'", str16, "hHI!HHI!IHhHhHI!IHI!!hhih!");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str22, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str8, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhI!hhI!ihHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str9, "HhI!hhI!ihHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hi!" + "'", str16, "Hhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhi!" + "'", str17, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str19, "hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHI!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHHI!");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!" + "'", str1, "hHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!hHHI!IHI!!");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhHI!HHI!IHHI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHhi!hhi!ihhi!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!hhI!ihHhi!hhi!ihhi!" + "'", str19, "hhI!hhI!ihHhi!hhi!ihhi!");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ih" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ih");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!hhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!hhhi!ihihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!ihhi!hhihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihhhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!hhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!i!ihi!!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!hhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str14, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str16, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str17, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str2, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str1, "hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("h", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhi!ihi!!" + "'", str7, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str10, "HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", (int) (byte) 1, (int) '#', "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!Hhhi!hhi!ihi!hhi!!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!Hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!HHi!IHHhi!hhi!ihhi!" + "'", str1, "hHi!HHi!IHHhi!hhi!ihhi!");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str19, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHIhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str23, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", (int) (short) 100, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!", 100, 100, "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "hHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str20, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        char[] charArray12 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHHI!IHI!!hI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!" + "'", str18, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!" + "'", str19, "hhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!hhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!IhhI!hhI!ihHi!HhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!ihhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!hhhI!hhI!ihHi!hhhI!hhI!ihHi!IhhI!hhI!ihHi!!hhI!hhI!ihHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        char[] charArray10 = new char[] { 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hi!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhHi!HHi!Ihhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str14, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!hhi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhi!ihi!hhi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhhi!hhi!ihi!hhi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!hhi!ihi!hhi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihi!hhi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihihhi!hhi!ihi!hhi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHi!HHi!Ihhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str19, "hhHi!HHi!Ihhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", (int) '4', "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!iHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!hhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!i!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!HHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHi!HHi!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHi!HHi!!ihi!!hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!" + "'", str1, "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHhI!hhI!ihhi!HI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHhI!hhI!ihhi!HI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHIH!", (int) (byte) 0, (int) (short) 1, "hhHi!HHi!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHi!HHi!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!" + "'", str4, "hhHi!HHi!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hHhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHI!HHI!IHI!HHI!!" + "'", str1, "HHI!HHI!IHHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!hhI!ihhHI!HHI!IHHI!", (int) (short) -1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!hhI!ihhHI!HHI!IHHI!" + "'", str4, "HhI!hhI!ihhHI!HHI!IHHI!");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        char[] charArray15 = new char[] { '#', '#', '4' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HI!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih", charArray15);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str23, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str26, "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!hhi!hhi!ih" + "'", str27, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!hhi!hhi!ih");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        char[] charArray15 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhih!" + "'", str20, "hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str22, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHi!HHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str11, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str13, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhi!ihi!!" + "'", str6, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!" + "'", str12, "hHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str13, "hhi!hhi!ihhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!" + "'", str14, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hHhI!hhI!ihHi!", (int) (short) 1, (int) 'a', "hhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhhhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhhhhhi!ihi!hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str1, "hhI!hhI!ihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", (int) 'a', (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ih" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ih");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("H", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str17, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!" + "'", str2, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str13, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!" + "'", str14, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str15, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        char[] charArray17 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHi!HHi!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHI!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHI!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str21, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str23, "HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str24, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihhi!" + "'", str26, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHi!HHi!IHHI!" + "'", str27, "HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str28, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!" + "'", str2, "Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!Hhhi!ihi!!");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhih!hhhhih!hhhhih!ihhhih!!hhhih!ihhhih!hhhhih!ihhhih!!hhhih!!", (int) 'a', (int) (byte) -1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhih!hhhhih!hhhhih!ihhhih!!hhhih!ihhhih!hhhhih!ihhhih!!hhhih!!" + "'", str4, "hhhhih!hhhhih!hhhhih!ihhhih!!hhhih!ihhhih!hhhhih!ihhhih!!hhhih!!");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str1, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        char[] charArray10 = new char[] { 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHhHI!IHI!!hhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hihhhih!h!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str13, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str14, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhi!" + "'", str15, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhHI!IHI!!hhih!" + "'", str16, "HHhHI!IHI!!hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str18, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhhi!hhi!ihhhi!hhi!ihhi!");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IhHi!HHi!IHhhhi!ihi!!HHHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHIhHi!HHi!IHhhhi!ihi!!!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!hHi!HHi!IHhhhi!ihi!!!!hhi!ihi!!hhHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HhHi!HHi!IHhhhi!ihi!!HI!IHI!!HHHI!IHIHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh!!HHHI!IHI!!IHHI!IHI!!!HHI!IHhHi!HHi!IHhhhi!ihi!!I!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str12, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str13, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str14, "hHI!HHI!IHHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str2, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str1, "hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHi!HHi!IHi!HHi!!", (int) (byte) 1, (int) (short) 0, "hHHHIH!HIHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHIH!HIHHHIH!H!" + "'", str4, "HhHHHIH!HIHHHIH!H!");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        char[] charArray16 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHI!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str21, "Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHi!HHi!IHHI!" + "'", str22, "HHi!HHi!IHHI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhi!" + "'", str23, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str24, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str25, "Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhi!" + "'", str15, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str19, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!HHI!IH", (int) '#', (int) (short) 10, "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHhhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str4, "HHI!HHI!IHhhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihh", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!" + "'", str15, "hhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HhhHi!HHi!IHi!HHi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhHi!HHi!IHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!HHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!iHHIHhHi!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHi!IHi!HHHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!i!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str8, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str9, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str11, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHi!HHi!IHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!HHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!iHHIHhHi!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHi!IHi!HHHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!i!!" + "'", str12, "HhHi!HHi!IHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!HHHI!IHI!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!!iHHIHhHi!Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!HHi!IHi!HHHhhhi!hhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!i!!");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHhi!ihi!!HHIH!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihHhHhi!ihi!!HHIH!" + "'", str2, "Hhi!hhi!ihHhHhi!ihi!!HHIH!");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str2, "Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhi!hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihHi!HHi!IHHI!hi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhHi!HHi!IHHI!hi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        char[] charArray11 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!IHI!!IhHI!IHI!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str16, "Hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!" + "'", str2, "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", (-1), (int) (short) -1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        char[] charArray15 = new char[] { '#', '#', '4' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HI!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhi!hhi!ihhi!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str23, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhi!" + "'", str25, "Hhi!hhi!ihhhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!" + "'", str26, "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str27, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str17, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str18, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hI!" + "'", str19, "hI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!", 1, "Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str1, "hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        char[] charArray15 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihI!hhI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str24, "hhhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        char[] charArray8 = new char[] { '4', 'a', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhHhI!hhI!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhHhI!hhI!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!HhI!hhI!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str12, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhi!i!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhi!i!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!hhi!hhi!ihhi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!" + "'", str13, "Hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str18, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str20, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str21, "hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!" + "'", str1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!Hhhi!ihi!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str1, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str2, "HHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", (int) (short) -1, (int) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ih" + "'", str4, "Hhi!hhi!ih");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str1, "hHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", (int) (byte) -1, "Hhhi!ihi!!HHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!HHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhI!hhI!ihHi!" + "'", str14, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        char[] charArray13 = new char[] { '4', 'a', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!hhih!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str18, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str19, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str20, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhih!" + "'", str23, "Hhhi!ihi!!hhih!");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", (int) (short) 0, "hHi!HHi!IHhhhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!" + "'", str4, "Hhi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hiHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!ihi!Hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str18, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!HHI!IHHHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhIHHI!HHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!iHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhIHHI!HHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!iHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!" + "'", str1, "hHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhIHHI!HHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!iHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        char[] charArray13 = new char[] { '#', '#', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihiHhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhI!hhI!ihhi!" + "'", str21, "hhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str22, "hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihihhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhi!hhi!ihhi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str18, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhi!" + "'", str19, "Hhi!hhi!ihhhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!IHI!!" + "'", str20, "hHHI!IHI!!");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!ihi!!" + "'", str10, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str11, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str12, "Hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        char[] charArray11 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhIh!hIhHhIh!h!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHhIh!hIhHhIh!h!" + "'", str16, "hhHhIh!hIhHhIh!h!");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!" + "'", str2, "HHI!HHI!IHHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str1, "hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        char[] charArray14 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHhI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHI!IHI!!hhih!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhi!" + "'", str18, "Hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!" + "'", str20, "Hhhhi!ihi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str21, "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhHI!IHI!!hhih!" + "'", str22, "hHhHI!IHI!!hhih!");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!!", (int) (short) 1, 1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihh", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhi!" + "'", str14, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str17, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihh" + "'", str18, "Hhi!hhi!ihh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!!" + "'", str20, "HHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!iHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!hHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!!");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!ihi!hhi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str19, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!" + "'", str20, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHIhHHI!IHI!!");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!" + "'", str15, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!" + "'", str17, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!" + "'", str19, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!HHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!HHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!hHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!IHHI!HHI!IHhHi!HHi!IHHhi!hhi!ihhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!" + "'", str1, "HhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", (int) (short) 10, (int) '4', "Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!Hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhi!hhi!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!hhhi!ihihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!!ihhi!hhihHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihhhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!hhhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!i!ihi!!ihhhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhi!hhi!ihhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!ihhi!ihi!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hi!");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", 0, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!HHI!IHI!HHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih", charArray9);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!" + "'", str16, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih" + "'", str18, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!HhI!hhI!ih");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", (int) (short) -1, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        char[] charArray11 = new char[] { '4', 'a', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!" + "'", str18, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhih!hihhhih!h!", (int) (short) 10, 100, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhih!hihhhih!h!" + "'", str4, "hhhhih!hihhhih!h!");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhhih!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhih!" + "'", str21, "Hhhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHI!IHI!!" + "'", str7, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str9, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str2, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!", 100, 10, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str4, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!IHI!!" + "'", str12, "hHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!" + "'", str13, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str14, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str1, "HHi!HHi!IHhhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!hhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!hHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!" + "'", str1, "hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!iHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", (int) (short) -1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str1, "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!" + "'", str1, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHHI!IHI!!HHHI!IHI!!HHI!HHHI!IHI!!");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhHHHI!IHI!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhIHHI!HHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!iHhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihhi!hhhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!" + "'", str1, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihhi!hhhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhihi!!!");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hihhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hihhhih!h!" + "'", str1, "Hhhhih!hihhhih!h!");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        char[] charArray15 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!" + "'", str1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!HHi!IHi!HHi!!" + "'", str16, "HHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str17, "HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!" + "'", str2, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihiHhhi!ihi!!");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", (int) (byte) 100, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!hi!" + "'", str4, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!hi!");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray12);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray12);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhHI!HHI!IHHI!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str22, "hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!", charArray9);
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
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", 100, "HhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!HhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHiHhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!HhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str4, "Hhi!hhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!HhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHiHhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!HhHI!HHI!IhHHI!IHI!!HHi!HHi!IHi!HHi!!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!" + "'", str1, "hHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHI!HHI!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!HHHI!IHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!!IHHI!HHIHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHHHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!HHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!I!IHI!!IHHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHI!HHI!IHHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!!HHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!IHHI!IHI!!Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HI!");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        char[] charArray16 = new char[] { '#', '#', '4' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("H", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!iHHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str20, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHI!IHI!!" + "'", str22, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str24, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str25, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str26, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!" + "'", str27, "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str28, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str29, "Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!", (int) (short) -1, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!HI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HH");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihHhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", (int) (short) 10, (int) ' ', "hhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHIHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHIHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str4, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHIHhHi!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHIHhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhhHi!HHi!IHHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str2, "HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHhHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!IHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!" + "'", str2, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!ihi!!");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHhI!hhI!ihhHHI!IHI!!HHI!HHI!IHI!HHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!HHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!Hi!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihi!!hi!" + "'", str24, "Hhhi!ihi!!hi!");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHHI!HHI!IHHHHI!IHI!!" + "'", str1, "hHHI!HHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHHHI!HHI!IHHHHI!IHI!!");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        char[] charArray13 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str17, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihh" + "'", str20, "Hhi!hhi!ihh");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str1, "hhhi!hhi!ihhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHi!HHi!IHHhi!hhi!ihhi!", (int) 'a', 100, "HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!IhhhhhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHIhHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!iHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!hHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!HHi!IHHhi!hhi!ihhi!" + "'", str4, "hHi!HHi!IHHhi!hhi!ihhi!");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        char[] charArray14 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHi!HHi!IHi!HHi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHi!HHi!IHHHi!HHi!IHi!HHi!!" + "'", str19, "hHi!HHi!IHHHi!HHi!IHi!HHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str20, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str21, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!" + "'", str22, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!", 0, "hhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhI!hhI!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhI!hhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!" + "'", str4, "hhhi!ihi!!");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        char[] charArray13 = new char[] { '#', '#', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHHI!IHI!!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhi!ihi!hhi!!" + "'", str22, "Hhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str23, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!", (int) ' ', (int) '#', "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!hi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!" + "'", str17, "hHhi!hhi!iHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhihhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!" + "'", str2, "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        char[] charArray12 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhhi!ihi!!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        char[] charArray10 = new char[] { '4', '#', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHhhhi!ihi!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str1, "HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihhi!hhi!ihhi!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhhi!hhi!ihhi!hi!hhi!ihi!hhi!!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        char[] charArray9 = new char[] { 'a' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHi!HHi!IHi!HHi!!", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!ihi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str15, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhiHhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str16, "Hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str1, "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        char[] charArray13 = new char[] { '#', '#', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!" + "'", str22, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!HhI!hhI!ihhi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHI!IHI!!" + "'", str23, "HHHI!IHI!!");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str22, "hHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhi!ihi!!" + "'", str6, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!" + "'", str7, "Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!" + "'", str8, "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!IHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!HHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHI!!");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        char[] charArray8 = new char[] { '#', '#', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str12, "hhHI!HHI!IhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!HHI!HHI!IHI!HHI!!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHI!HHI!IHI!HHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHI!HHI!!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str13, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhhhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!ihhi!ihi!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!ihhi!ihi!!!" + "'", str2, "hhhi!ihi!!ihhi!ihi!!!");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        char[] charArray8 = new char[] { 'a' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!", charArray8);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhih!" + "'", str15, "Hhhih!");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihHhHhi!ihi!!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHhHhHI!IHI!!hhih!" + "'", str1, "hHI!HHI!IHhHhHI!IHI!!hhih!");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", (int) (short) 10, (int) (short) -1, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str4, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhhhi!hhi!hhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!" + "'", str2, "hhhhi!hhi!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!ihi!hhi!!");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhi!hhi!ihhhhi!ihi!!hhi!hhi!ihi!hhHhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHhHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!" + "'", str1, "HhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHhHHI!IHI!!Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", (int) 'a', "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!Hhi!hHHHI!IHI!!hi!ihhhhi!HHHI!IHI!!ihi!!hhhi!HHHI!IHI!!ihi!!ihhi!HHHI!IHI!!ihi!!!hhi!HHHI!IHI!!ihi!!hhhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!Hhi!hhi!ihi!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        char[] charArray15 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHi!HHi!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHhIh!hIhHhhih!HhIh!h!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!" + "'", str24, "HHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!IHI!hHI!HHI!IHI!!HI!IHI!HHI!IHI!!HI!!HI!!");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!" + "'", str2, "HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHIhhhih!!HHHHI!HHI!IHHHI!HHI!IHHI!HI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHhhhih!I!IHI!!IHHI!HHI!HHI!IHHI!!HHIHHI!HHI!IHHHI!HHI!IHHI!!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!hhhih!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!HHHI!HHHI!HHI!IHHHI!HHI!IHHI!HI!IHHHHI!IHI!!HHHIhhhih!!IHI!!IHHI!HHI!HHI!IHHI!IHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!HHI!HHIHHI!HHI!IHHHI!HHhhhih!I!IHHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHI!!");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        char[] charArray10 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str13, "HHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!" + "'", str14, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!", 0, "Hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHhHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!hi!hi!ihi!!HHi!HHi!IHi!HHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!" + "'", str4, "HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HhHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("h", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhHhIh!hIhHhIh!h!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhHI!IHI!!IhHI!IHI!!!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hhhi!ihi!!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHIHHHI!HHI!IHI!HHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!ihi!!Hi!" + "'", str10, "hhhi!ihi!!Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hhhi!ihi!!" + "'", str13, "hHHI!IHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!IHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        char[] charArray10 = new char[] { '4', 'a', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!iHhi!ihi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!ihhi!ihi!!!" + "'", str14, "Hhhi!ihi!!ihhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!" + "'", str15, "Hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!" + "'", str16, "HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!!hHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!HhHHhi!ihi!!iHhi!ihi!!!IhHHhi!ihi!!iHhi!ihi!!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihhhi!hhi!ihhhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!ihi!!" + "'", str13, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!" + "'", str16, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHHHI!IHI!!HI!IHHHHI!HHHI!IHI!!IHI!!HHHI!HHHI!IHI!!IHI!!IHHI!HHHI!IHI!!IHI!!!HHI!HHHI!IHI!!IHI!!HHHI!");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhi!" + "'", str15, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!" + "'", str18, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhhhi!ihHhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!", (-1), (int) (byte) 1, "HHhhHI!IHI!!IhHI!IHI!!!hHhhHI!IHI!!IhHI!IHI!!!iHhhHI!IHI!!IhHI!IHI!!!!HhhHI!IHI!!IhHI!IHI!!!hHhhHHhI!hhI!ihhhhi!ihi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!", (int) '4', (int) (short) -1, "hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!" + "'", str4, "hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!I!hhI!!");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!", (int) (byte) 0, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!" + "'", str4, "Hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!hhi!ihhhi!hhi!ihhi!hhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!!!hhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!hhhhi!ihi!!ihhi!ihi!!!ihhhi!ihi!!ihhi!ihi!!!!hhhhhi!hhi!ihhhi!hhi!ihhi!i!ihi!!ihhi!ihi!!!!");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        char[] charArray9 = new char[] { '#', '#', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHI!IHI!!" + "'", str12, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ihhi!" + "'", str13, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str14, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str15, "hhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!", (-1), (int) (byte) -1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihhhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!hhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!hhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihhhhi!ihi!!ihhi!hhi!ihhhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!" + "'", str4, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HI!");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hhI!!", 100, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        char[] charArray3 = new char[] { 'a' };
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHhhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("h", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray9);
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
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihI!hhI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!hhI!ihHi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihihhhi!ihi!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!" + "'", str20, "HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!IHI!!IhHI!IHI!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str16, "hhHI!IHI!!IhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!" + "'", str19, "HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        char[] charArray10 = new char[] { ' ', 'a', 'a', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!IhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!hHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!IhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!IhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!hHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!hHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!HhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!IhHI!HHI!IHHHHI!IHI!!HHI!HHI!IHI!HHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihi!!hhih!" + "'", str1, "hhhhi!ihi!!hhih!");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihhi!hhhi!hhi!ihhi!ihhi!hhi!ihhi!!hhi!hhi!ihhhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHHI!IHI!!HI!" + "'", str1, "hHHI!HHI!IHHI!HHHI!HHI!IHHI!IHHI!HHI!IHHI!!HHI!HHI!IHHHI!IHI!!HI!");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!Ihhhi!ihi!!hhI!hhI!ihI!hhI!!!hhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!hhhhi!ihi!!hhI!hhI!ihI!hhI!!ihhhi!ihi!!hhI!hhI!ihI!hhI!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhhhi!ihi!!hi!ihhhhi!hhhi!ihi!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhi!" + "'", str15, "hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str1, "Hhhhi!ihi!HHHI!IHI!!hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!HHIH!", 100, 100, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!HHi!IHi!HHi!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHi!HHi!IHi!HHi!!hi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hHHi!HHi!IHi!HHi!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHi!HHi!IHi!HHi!!hi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!HHi!IHi!HHi!!!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihiHHi!HHi!IHi!HHi!!!hhi!!ihhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!HHIH!" + "'", str4, "Hhhi!ihi!!hHI!HHI!IHHHHI!IHI!!HHHI!HHIH!");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        char[] charArray9 = new char[] { '4', 'a', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!IHI!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHI!IHI!!" + "'", str13, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!" + "'", str14, "hhHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!I!HHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str15, "hhi!hhi!ihhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!" + "'", str2, "hHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!HHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!HHHHI!IHI!!HHI!HHI!IHI!HHI!!IHHHI!IHI!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhi!hhi!ih");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!HHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!", (int) (short) -1, (int) (byte) 1, "hHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHIH!HIHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHIH!HIHHHIH!H!" + "'", str1, "hHHHIH!HIHHHIH!H!");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhih!" + "'", str10, "hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HhHi!HHi!IHhI!", (int) (byte) 10, "hhhHI!IHI!!IhHI!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!IHI!hhhHI!IHI!!IhHI!IHI!!!!HHi!HHi!IhhhHI!IHI!!IhHI!IHI!!!Hi!HHi!!HHhhhHI!IHI!!IhHI!IHI!!!HHI!IHI!!HhhhHI!IHI!!IhHI!IHI!!!Hi!HHi!IHihhhHI!IHI!!IhHI!IHI!!!!HHi!!iHHHhhhHI!IHI!!IhHI!IHI!!!I!IHI!!HHihhhHI!IHI!!IhHI!IHI!!!!HHi!IHi!HhhhHI!IHI!!IhHI!IHI!!!Hi!!!HHHI!hhhHI!IHI!!IhHI!IHI!!!IHI!!HHi!HhhhHI!IHI!!IhHI!IHI!!!hHi!HHi!IHhhhHI!IHI!!IhHI!IHI!!!hI!" + "'", str4, "HHHHI!IHI!hhhHI!IHI!!IhHI!IHI!!!!HHi!HHi!IhhhHI!IHI!!IhHI!IHI!!!Hi!HHi!!HHhhhHI!IHI!!IhHI!IHI!!!HHI!IHI!!HhhhHI!IHI!!IhHI!IHI!!!Hi!HHi!IHihhhHI!IHI!!IhHI!IHI!!!!HHi!!iHHHhhhHI!IHI!!IhHI!IHI!!!I!IHI!!HHihhhHI!IHI!!IhHI!IHI!!!!HHi!IHi!HhhhHI!IHI!!IhHI!IHI!!!Hi!!!HHHI!hhhHI!IHI!!IhHI!IHI!!!IHI!!HHi!HhhhHI!IHI!!IhHI!IHI!!!hHi!HHi!IHhhhHI!IHI!!IhHI!IHI!!!hI!");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!" + "'", str18, "hHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!HHi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hI!" + "'", str19, "hI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!" + "'", str2, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!I!HHI!!");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("h", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhi!ihi!!" + "'", str8, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str11, "HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!hHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!HhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!IhHhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!" + "'", str12, "HHHHIH!HHHHHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhhhi!ihi!!hhhi!ihi!!HHI!HHI!IHHI!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        char[] charArray10 = new char[] { '#', '#', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str16, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        char[] charArray12 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhI!hhI!ihI!hhI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!IHI!!hhI!hhI!ihI!hhI!!" + "'", str18, "hHHI!IHI!!hhI!hhI!ihI!hhI!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        char[] charArray15 = new char[] { '#', 'a', ' ', ' ', 'a', 'a' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihi!hhi!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a  aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhih!" + "'", str20, "hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhhi!ihi!!hhih!" + "'", str23, "hhhhi!ihi!!hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str24, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhhi!hhi!ihhhhi!ihi!!");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!ihhi!ihi!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHI!!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHi!HHi!IHi!HHi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!" + "'", str21, "hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!ihhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!hhhhi!ihi!!hi!hhhhi!ihi!!hi!ihhhi!ihi!!hi!!hhhi!ihi!!hi!!");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        char[] charArray13 = new char[] { '#', '#', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HI!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str21, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str23, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str2, "Hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!IHI!!IhHI!IHI!!!", 100, "hhHHI!HHI!Hhhi!ihi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!ihHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!hhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!IHI!HHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!IHI!!IhHI!IHI!!!" + "'", str4, "HhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!", (int) (short) 1, (int) (byte) -1, "hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhihhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!!HHhi!hhi!ihHhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!", 0, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!" + "'", str4, "hHI!HHI!IHHHHI!IHI!!HHHI!IHI!!HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHhHI!HHI!IHhHHI!IHI!!HHHI!IHI!!hhI!hhI!ihI!hhI!!", charArray4);
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
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("h", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhih!" + "'", str6, "Hhih!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!" + "'", str7, "hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!HHi!HHi!IHi!HHi!!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!HHi!HHi!IHi!HHi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!HHi!HHi!IHi!HHi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!HHi!HHi!IHi!HHi!!Ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!" + "'", str8, "hhi!hhi!ihHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hhhi!ihi!!Hhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!ihhi!hhi!iHhi!hhi!ihHhhi!ihi!!hhI!hhI!ihI!hHhih!hhI!!hi!!");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihhHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!iHHHI!IHI!!HHi!HHi!IHi!HHi!!!HHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!HHHHI!IHI!!HHi!HHi!IHi!HHi!!IHHHI!IHI!!HHi!HHi!IHi!HHi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        char[] charArray12 = new char[] { '#', '#', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHI!IHI!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhI!hhI!ihHi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!hhi!hhi!ihhi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!HHi!IHHHHI!IHI!!HHHI!IHI!!iHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!IHI!!iHHI!IHI!!!HHI!IHI!!IHHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!HI!!HHHI!IHI!!iHHI!IHI!!!HHI!IHIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!!HHHI!IHI!!HHHI!IHI!!iHHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!!HHI!IHI!!!i!HHi!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Ihhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!Hhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.Class<?> wildcardClass22 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhI!hhI!ihHi!" + "'", str16, "HhI!hhI!ihHi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!" + "'", str17, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!hhi!hhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!" + "'", str18, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!hi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!" + "'", str20, "hHI!HHI!IHHHI!HHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!IHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!!HHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!IHI!!IhHI!IHI!!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!IHI!!IhHI!IHI!!!" + "'", str2, "hhHI!IHI!!IhHI!IHI!!!");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hHhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!HI!");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', ' ', ' ' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str14, "hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        char[] charArray11 = new char[] { '#', '#', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!hhI!ihhhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!Ihhi!ihi!!!hhi!ihi!!!I!hhI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!hhhhi!ihi!!hhi!hhi!ihi!hhi!!ihhhi!ihi!!hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!ihi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHI!IHI!!" + "'", str17, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!!hhi!hhi!hhi!ihi!hhi!!ihi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhi!hhi!ihi!hhi!!!hhi!ihi!!ihhi!ihi!!hhhi!ihi!!ihhi!hhi!hhi!ihi!hhi!!ihi!!!hhi!ihi!!hhhi!ihi!!hhhi!ihi!!hhi!hhi!ihi!hhi!!ihhi!ihi!!!hhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
}

