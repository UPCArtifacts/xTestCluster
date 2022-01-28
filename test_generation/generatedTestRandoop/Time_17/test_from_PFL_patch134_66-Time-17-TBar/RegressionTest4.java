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
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 10);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean10 = dateTimeZone9.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone9.getName((long) 0, locale12);
        java.lang.String str15 = dateTimeZone9.getNameKey((long) ' ');
        long long17 = dateTimeZone9.nextTransition((long) 115200000);
        long long20 = dateTimeZone9.adjustOffset((-345659896L), false);
        boolean boolean21 = dateTimeZone2.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200000L + "'", long17 == 115200000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-345659896L) + "'", long20 == (-345659896L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long8 = dateTimeZone5.nextTransition((-230339948L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) (byte) 10, locale12);
        java.lang.String str15 = dateTimeZone10.getName(10L);
        long long18 = dateTimeZone10.convertLocalToUTC(0L, true);
        java.lang.String str19 = dateTimeZone10.toString();
        java.lang.String str20 = dateTimeZone10.toString();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone10.getOffset(readableInstant21);
        long long24 = dateTimeZone10.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone26.getShortName((long) (byte) 10, locale28);
        java.lang.String str30 = dateTimeZone26.getID();
        java.lang.String str31 = dateTimeZone26.getID();
        java.lang.String str32 = dateTimeZone26.getID();
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone26.getOffset(readableInstant33);
        int int36 = dateTimeZone26.getStandardOffset(230340010L);
        boolean boolean37 = dateTimeZone10.equals((java.lang.Object) dateTimeZone26);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone10.getOffset(readableInstant38);
        java.lang.String str41 = dateTimeZone10.getShortName((-230339948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long44 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (-230099990L));
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone10.getShortName((-226859949L), locale46);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230339948L) + "'", long8 == (-230339948L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115200000L) + "'", long18 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115200000 + "'", int34 == 115200000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 115200000 + "'", int39 == 115200000);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-345299990L) + "'", long44 == (-345299990L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+32:00" + "'", str47, "+32:00");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long12 = dateTimeZone1.previousTransition(115260000L);
        int int14 = dateTimeZone1.getStandardOffset(0L);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115260000L + "'", long12 == 115260000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int15 = dateTimeZone1.getStandardOffset(158339999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName((-115139948L));
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) nameProvider6);
        long long12 = dateTimeZone1.convertLocalToUTC((-230279990L), true);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-230280090L) + "'", long12 == (-230280090L));
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        long long11 = dateTimeZone1.adjustOffset((-230399900L), true);
        long long14 = dateTimeZone1.adjustOffset((-230460003L), false);
        int int16 = dateTimeZone1.getOffsetFromLocal((-187199956L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230399900L) + "'", long11 == (-230399900L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230460003L) + "'", long14 == (-230460003L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long4 = dateTimeZone0.previousTransition((-115139990L));
        java.lang.String str6 = dateTimeZone0.getName((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139990L) + "'", long4 == (-115139990L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(52L, locale6);
        long long11 = dateTimeZone1.convertLocalToUTC((-230459903L), false, (-115199999L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230460003L) + "'", long11 == (-230460003L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-187259990L), locale11);
        java.lang.String str14 = dateTimeZone1.getName((long) 'a');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((-115139990L), locale16);
        long long20 = dateTimeZone1.convertLocalToUTC((-72059948L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-187259948L) + "'", long20 == (-187259948L));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition((-115139999L));
        java.lang.String str6 = dateTimeZone2.getName((long) 100);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName((-474599949L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139999L) + "'", long4 == (-115139999L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:10" + "'", str6, "+00:10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:10" + "'", str9, "+00:10");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName(230399999L, locale16);
        int int19 = dateTimeZone1.getStandardOffset((long) (short) 1);
        long long21 = dateTimeZone1.nextTransition((long) (short) 100);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) (-3539990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(101L);
        boolean boolean10 = dateTimeZone1.isFixed();
        long long13 = dateTimeZone1.convertLocalToUTC((-118799900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-118799900L) + "'", long13 == (-118799900L));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.Class<?> wildcardClass16 = timeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone4.previousTransition((long) (byte) -1);
        long long10 = dateTimeZone4.convertLocalToUTC(115199999L, true, (long) '#');
        long long12 = dateTimeZone4.nextTransition((long) 10);
        int int14 = dateTimeZone4.getOffsetFromLocal((-115199900L));
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (-115139948L));
        int int18 = dateTimeZone2.getStandardOffset((-115140001L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int22 = dateTimeZone20.getOffsetFromLocal((-1L));
        long long24 = dateTimeZone20.convertUTCToLocal((-1L));
        java.lang.String str26 = dateTimeZone20.getName((-1L));
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone20.getOffset(readableInstant27);
        java.lang.String str29 = dateTimeZone20.toString();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        boolean boolean33 = dateTimeZone20.equals((java.lang.Object) 0);
        boolean boolean34 = dateTimeZone2.equals((java.lang.Object) dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-230339948L) + "'", long16 == (-230339948L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115199999L + "'", long24 == 115199999L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, (long) (byte) 10);
        int int22 = dateTimeZone17.getStandardOffset(101L);
        long long25 = dateTimeZone17.convertLocalToUTC((-59965L), true);
        java.lang.String str27 = dateTimeZone17.getName((-115259948L));
        java.util.TimeZone timeZone28 = dateTimeZone17.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115259965L) + "'", long25 == (-115259965L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone1.getNameKey((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getShortName((long) (byte) 10, locale18);
        java.lang.String str20 = dateTimeZone16.getID();
        java.lang.String str21 = dateTimeZone16.getID();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean25 = dateTimeZone16.equals((java.lang.Object) dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey((long) (byte) 1);
        boolean boolean28 = dateTimeZone24.isFixed();
        java.util.TimeZone timeZone29 = dateTimeZone24.toTimeZone();
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getShortName((long) 100, locale31);
        java.lang.String str34 = dateTimeZone24.getNameKey((long) 100);
        java.lang.String str36 = dateTimeZone24.getShortName((-183660000L));
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (-3539990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+52:01" + "'", str32, "+52:01");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+52:01" + "'", str36, "+52:01");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-75599990L) + "'", long38 == (-75599990L));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(115139999L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName(0L, locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone13, (long) (byte) 10);
        long long19 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (-230399900L));
        int int21 = dateTimeZone2.getStandardOffset(3540101L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60010L + "'", long17 == 60010L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-229859900L) + "'", long19 == (-229859900L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 600000 + "'", int21 == 600000);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        boolean boolean9 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        int int14 = dateTimeZone1.getStandardOffset((-115199990L));
        int int16 = dateTimeZone1.getOffsetFromLocal((-115199949L));
        boolean boolean17 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (byte) 10, locale7);
        java.lang.String str9 = dateTimeZone5.getID();
        long long11 = dateTimeZone5.convertUTCToLocal((-230339900L));
        long long13 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, 60010L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((long) 1, locale15);
        java.lang.String str18 = dateTimeZone2.getNameKey((-115139948L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115079990L) + "'", long13 == (-115079990L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(60000L);
        long long12 = dateTimeZone2.previousTransition((-115139999L));
        long long16 = dateTimeZone2.convertLocalToUTC(3719900L, true, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115139999L) + "'", long12 == (-115139999L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3659900L + "'", long16 == 3659900L);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getOffset(115199999L);
        java.lang.String str9 = dateTimeZone2.getName((-115139900L));
        int int11 = dateTimeZone2.getOffset((-72060001L));
        java.lang.String str12 = dateTimeZone2.getID();
        long long16 = dateTimeZone2.convertLocalToUTC((-359399949L), false, (long) 52);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-359459949L) + "'", long16 == (-359459949L));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.nextTransition((long) (byte) -1);
        int int7 = dateTimeZone2.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int12 = dateTimeZone10.getOffsetFromLocal((-1L));
        boolean boolean13 = dateTimeZone10.isFixed();
        long long15 = dateTimeZone10.convertUTCToLocal((long) 10);
        boolean boolean17 = dateTimeZone10.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone10.isLocalDateTimeGap(localDateTime18);
        long long21 = dateTimeZone10.nextTransition(10L);
        long long23 = dateTimeZone10.previousTransition((-115199900L));
        long long25 = dateTimeZone2.getMillisKeepLocal(dateTimeZone10, (long) 0);
        java.util.TimeZone timeZone26 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        boolean boolean32 = dateTimeZone30.isStandardOffset(226800000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200010L + "'", long15 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115199900L) + "'", long23 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115140000L) + "'", long25 == (-115140000L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 100, locale8);
        long long12 = dateTimeZone1.adjustOffset(97L, false);
        int int14 = dateTimeZone1.getOffset((long) 1);
        int int16 = dateTimeZone1.getOffset(60001L);
        long long18 = dateTimeZone1.nextTransition((-115199949L));
        long long20 = dateTimeZone1.previousTransition(230339910L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115199949L) + "'", long18 == (-115199949L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 230339910L + "'", long20 == 230339910L);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getNameKey(0L);
        java.lang.String str13 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int17 = dateTimeZone15.getOffsetFromLocal((-1L));
        boolean boolean18 = dateTimeZone15.isFixed();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone15.getOffset(readableInstant19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getShortName((long) 60000, locale22);
        long long27 = dateTimeZone15.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.util.TimeZone timeZone29 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        int int33 = dateTimeZone15.getStandardOffset((-230399965L));
        boolean boolean34 = dateTimeZone1.equals((java.lang.Object) int33);
        boolean boolean36 = dateTimeZone1.isStandardOffset(0L);
        int int38 = dateTimeZone1.getOffset((-120001L));
        long long40 = dateTimeZone1.convertUTCToLocal(100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115199999L) + "'", long27 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 115200000 + "'", int38 == 115200000);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 115200100L + "'", long40 == 115200100L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int8 = dateTimeZone6.getOffsetFromLocal((-1L));
        boolean boolean9 = dateTimeZone6.isFixed();
        long long11 = dateTimeZone6.convertUTCToLocal((long) 10);
        boolean boolean13 = dateTimeZone6.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.lang.String str16 = dateTimeZone6.getNameKey((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName(0L, locale19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone6.getShortName((-115259900L), locale22);
        long long25 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 115199999L);
        java.lang.String str26 = dateTimeZone6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115200010L + "'", long11 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.nextTransition((-230399900L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(0L, locale15);
        java.lang.String str17 = dateTimeZone1.getID();
        java.lang.String str18 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getShortName((long) (byte) 10, locale18);
        java.lang.String str21 = dateTimeZone16.getName(10L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 115200010L);
        java.lang.String str24 = dateTimeZone16.getID();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getShortName((-589799949L), locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone16.getName(34L, locale29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115200010L + "'", long23 == 115200010L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        java.lang.String str9 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((long) '#');
        java.lang.String str15 = dateTimeZone4.getNameKey((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName((long) (byte) 10, locale23);
        java.lang.String str25 = dateTimeZone21.getID();
        long long27 = dateTimeZone21.convertUTCToLocal((-230339900L));
        long long29 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, 60010L);
        long long31 = dateTimeZone4.getMillisKeepLocal(dateTimeZone18, (long) '#');
        int int33 = dateTimeZone18.getOffset(100L);
        long long36 = dateTimeZone18.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115139900L) + "'", long27 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115079990L) + "'", long29 == (-115079990L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115140035L + "'", long31 == 115140035L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60000 + "'", int33 == 60000);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str18 = dateTimeZone16.getNameKey(187860000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        long long5 = dateTimeZone1.convertLocalToUTC(3660000L, true, (-589799849L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3659903L + "'", long5 == 3659903L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(1L, locale4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:10" + "'", str5, "+00:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:10" + "'", str8, "+00:10");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone4.previousTransition((long) (byte) -1);
        long long10 = dateTimeZone4.convertLocalToUTC(115199999L, true, (long) '#');
        long long12 = dateTimeZone4.nextTransition((long) 10);
        int int14 = dateTimeZone4.getOffsetFromLocal((-115199900L));
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (-115139948L));
        long long20 = dateTimeZone4.convertLocalToUTC((-230279990L), false, 187320010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 114599999L + "'", long10 == 114599999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 600000 + "'", int14 == 600000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115139948L) + "'", long16 == (-115139948L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-230879990L) + "'", long20 == (-230879990L));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        boolean boolean12 = dateTimeZone1.isStandardOffset(115260010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean15 = dateTimeZone1.isStandardOffset((-230279900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int18 = dateTimeZone1.getOffsetFromLocal((-115199903L));
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getName(115200035L, locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone23.getShortName((long) (byte) 10, locale25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone23.getName((long) (-1), locale28);
        boolean boolean30 = dateTimeZone23.isFixed();
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone23.isLocalDateTimeGap(localDateTime31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone23.getOffset(readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long39 = dateTimeZone36.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone40 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        boolean boolean43 = dateTimeZone23.equals((java.lang.Object) dateTimeZone42);
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone42, (-417600000L));
        long long47 = dateTimeZone1.previousTransition((-115199903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115200000 + "'", int34 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 115200052L + "'", long39 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-302460000L) + "'", long45 == (-302460000L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-115199903L) + "'", long47 == (-115199903L));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.nextTransition((-230399900L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(0L, locale15);
        java.lang.String str17 = dateTimeZone1.getID();
        java.lang.String str18 = dateTimeZone1.getID();
        long long21 = dateTimeZone1.adjustOffset((-115139948L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115139948L) + "'", long21 == (-115139948L));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        int int5 = dateTimeZone1.getOffset(115199999L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) 10, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str9 = dateTimeZone1.getName((-230399958L));
        long long11 = dateTimeZone1.convertUTCToLocal((-111480100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3719900L + "'", long11 == 3719900L);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long19 = dateTimeZone4.nextTransition(115140000L);
        long long22 = dateTimeZone4.convertLocalToUTC(115200032L, false);
        java.lang.String str24 = dateTimeZone4.getNameKey(187200000L);
        java.lang.String str26 = dateTimeZone4.getNameKey(115259900L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115140000L + "'", long19 == 115140000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(60010L, locale10);
        int int13 = dateTimeZone1.getStandardOffset((-115199990L));
        long long15 = dateTimeZone1.nextTransition(51L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 51L + "'", long15 == 51L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        java.util.TimeZone timeZone18 = dateTimeZone4.toTimeZone();
        int int20 = dateTimeZone4.getStandardOffset(230400000L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone4.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(60000L);
        int int12 = dateTimeZone2.getOffset(115200101L);
        boolean boolean13 = dateTimeZone2.isFixed();
        java.lang.String str15 = dateTimeZone2.getShortName((-704939949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getShortName(97L);
        java.lang.String str14 = dateTimeZone10.getName((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        int int12 = dateTimeZone1.getStandardOffset((-230339999L));
        long long15 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long18 = dateTimeZone1.adjustOffset(302460010L, false);
        java.lang.String str20 = dateTimeZone1.getShortName(113039999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 302460010L + "'", long18 == 302460010L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone11.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone11.getName(1L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) 1);
        long long22 = dateTimeZone11.nextTransition(115200000L);
        long long24 = dateTimeZone11.convertUTCToLocal(115139999L);
        java.util.TimeZone timeZone25 = dateTimeZone11.toTimeZone();
        int int27 = dateTimeZone11.getOffsetFromLocal((-120001L));
        long long31 = dateTimeZone11.convertLocalToUTC(114600000L, true, (-115199848L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 230339999L + "'", long24 == 230339999L);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-600000L) + "'", long31 == (-600000L));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 115200000);
        long long20 = dateTimeZone1.convertLocalToUTC(115260000L, true, (long) '#');
        int int22 = dateTimeZone1.getOffsetFromLocal((-115259948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int6 = dateTimeZone4.getOffsetFromLocal((-1L));
        boolean boolean7 = dateTimeZone4.isFixed();
        long long9 = dateTimeZone4.convertUTCToLocal((long) 10);
        boolean boolean11 = dateTimeZone4.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone4.isLocalDateTimeGap(localDateTime12);
        java.util.TimeZone timeZone14 = dateTimeZone4.toTimeZone();
        java.lang.String str15 = dateTimeZone4.toString();
        java.lang.String str17 = dateTimeZone4.getNameKey((-115139948L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (-111659938L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115200010L + "'", long9 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-226859928L) + "'", long19 == (-226859928L));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition(115200052L);
        java.lang.String str6 = dateTimeZone2.getName(0L);
        long long8 = dateTimeZone2.convertUTCToLocal(115200100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone2.getShortName(0L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:10" + "'", str6, "+10:10");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 151800100L + "'", long8 == 151800100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:10" + "'", str11, "+10:10");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.nextTransition((-115259900L));
        java.lang.String str4 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115259900L) + "'", long3 == (-115259900L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 10);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) 10);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getShortName((long) (byte) 0, locale9);
        java.lang.String str12 = dateTimeZone2.getNameKey((-1L));
        java.lang.String str14 = dateTimeZone2.getNameKey((-345539903L));
        long long16 = dateTimeZone2.convertUTCToLocal((-115200000L));
        java.lang.String str17 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+52:01" + "'", str10, "+52:01");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 72060000L + "'", long16 == 72060000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getStandardOffset(230399999L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone1.previousTransition((-183660000L));
        java.lang.String str17 = dateTimeZone1.getShortName(118740000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-183660000L) + "'", long15 == (-183660000L));
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        long long7 = dateTimeZone1.convertUTCToLocal((long) '4');
        long long9 = dateTimeZone1.convertUTCToLocal((-3599900L));
        boolean boolean11 = dateTimeZone1.isStandardOffset(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 51L + "'", long7 == 51L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599901L) + "'", long9 == (-3599901L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        boolean boolean9 = dateTimeZone2.isStandardOffset((long) (byte) 10);
        long long12 = dateTimeZone2.convertLocalToUTC(230339999L, false);
        int int14 = dateTimeZone2.getStandardOffset((-230399965L));
        java.lang.String str15 = dateTimeZone2.toString();
        java.lang.String str17 = dateTimeZone2.getName(0L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone2.getName(115259975L, locale19);
        int int22 = dateTimeZone2.getOffset((-111540000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 230279999L + "'", long12 == 230279999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.adjustOffset((long) (byte) -1, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.Class<?> wildcardClass8 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone11.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone11.getName(1L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) 1);
        long long23 = dateTimeZone1.adjustOffset((-111659899L), false);
        java.lang.String str24 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-111659899L) + "'", long23 == (-111659899L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (long) (byte) 10);
        long long16 = dateTimeZone2.convertLocalToUTC(115200000L, false, 0L);
        long long18 = dateTimeZone2.previousTransition((-115139948L));
        java.lang.String str20 = dateTimeZone2.getNameKey((-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115140000L + "'", long16 == 115140000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115139948L) + "'", long18 == (-115139948L));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.lang.String str7 = dateTimeZone1.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(115139999L, locale9);
        java.lang.String str12 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone14.getShortName((long) (byte) 10, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getName((long) (-1), locale19);
        boolean boolean21 = dateTimeZone14.isFixed();
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone14.getOffset(readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long30 = dateTimeZone27.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone31 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        boolean boolean34 = dateTimeZone14.equals((java.lang.Object) dateTimeZone33);
        java.lang.String str35 = dateTimeZone33.getID();
        boolean boolean36 = dateTimeZone1.equals((java.lang.Object) dateTimeZone33);
        boolean boolean37 = dateTimeZone33.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200052L + "'", long30 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 10);
        long long4 = dateTimeZone2.nextTransition((long) 100);
        long long7 = dateTimeZone2.adjustOffset((long) (short) -1, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        boolean boolean9 = dateTimeZone2.isStandardOffset((long) (byte) 10);
        long long13 = dateTimeZone2.convertLocalToUTC((-115199966L), true, (-115199998L));
        long long15 = dateTimeZone2.convertUTCToLocal(226800000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115259966L) + "'", long13 == (-115259966L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 226860000L + "'", long15 == 226860000L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        long long10 = dateTimeZone0.previousTransition(115200035L);
        long long12 = dateTimeZone0.convertUTCToLocal((-345599896L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139990L) + "'", long4 == (-115139990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60001L) + "'", long8 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200035L + "'", long10 == 115200035L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-345539896L) + "'", long12 == (-345539896L));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        java.lang.String str15 = dateTimeZone1.getID();
        java.lang.String str17 = dateTimeZone1.getShortName(100L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int23 = dateTimeZone21.getOffsetFromLocal((-1L));
        boolean boolean24 = dateTimeZone21.isFixed();
        long long28 = dateTimeZone21.convertLocalToUTC((-115139900L), false, (long) '4');
        long long31 = dateTimeZone21.convertLocalToUTC(115199999L, false);
        long long33 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, 360000000L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone21.getName((-115199990L), locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-230339900L) + "'", long28 == (-230339900L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 360000000L + "'", long33 == 360000000L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getName((-115079990L));
        int int15 = dateTimeZone1.getOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str19 = dateTimeZone18.toString();
        long long21 = dateTimeZone18.nextTransition((long) (byte) -1);
        int int23 = dateTimeZone18.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (-230339900L));
        long long28 = dateTimeZone1.convertUTCToLocal(118740000L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone1.getOffset(readableInstant29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115199900L) + "'", long26 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 233940000L + "'", long28 == 233940000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getShortName((long) (byte) 10, locale18);
        java.lang.String str21 = dateTimeZone16.getName(10L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 115200010L);
        boolean boolean25 = dateTimeZone16.isStandardOffset(115200000L);
        long long28 = dateTimeZone16.adjustOffset(32L, true);
        java.lang.String str30 = dateTimeZone16.getName((-115199899L));
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int34 = dateTimeZone32.getOffsetFromLocal((-1L));
        boolean boolean35 = dateTimeZone32.isFixed();
        long long37 = dateTimeZone32.convertUTCToLocal((long) 10);
        boolean boolean39 = dateTimeZone32.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        long long45 = dateTimeZone32.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str47 = dateTimeZone32.getNameKey((long) 115200000);
        long long51 = dateTimeZone32.convertLocalToUTC(115260000L, true, (long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        boolean boolean53 = dateTimeZone16.equals((java.lang.Object) dateTimeZone32);
        java.lang.String str55 = dateTimeZone32.getShortName(230459975L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        java.lang.String str57 = dateTimeZone32.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115200010L + "'", long23 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115200000 + "'", int34 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 115200010L + "'", long37 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 60000L + "'", long51 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+32:00" + "'", str55, "+32:00");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+32:00" + "'", str57, "+32:00");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(0L, locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        long long15 = dateTimeZone1.adjustOffset(115140035L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115140035L + "'", long15 == 115140035L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.lang.String str15 = dateTimeZone1.getName((long) (short) -1);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getName((-345599965L), locale17);
        long long20 = dateTimeZone1.convertUTCToLocal(115200100L);
        long long23 = dateTimeZone1.adjustOffset(51L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399903L) + "'", long13 == (-230399903L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 230400100L + "'", long20 == 230400100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 51L + "'", long23 == 51L);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int18 = dateTimeZone16.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getShortName((-230399903L));
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-3659900L));
        java.util.TimeZone timeZone26 = dateTimeZone20.toTimeZone();
        boolean boolean28 = dateTimeZone20.isStandardOffset((-111539990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 111540100L + "'", long25 == 111540100L);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        long long5 = dateTimeZone1.previousTransition((long) 60000);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60000L + "'", long5 == 60000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (byte) 10, locale7);
        java.lang.String str9 = dateTimeZone5.getID();
        long long11 = dateTimeZone5.convertUTCToLocal((-230339900L));
        long long13 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, 60010L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((long) 1, locale15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) (byte) 10, locale20);
        java.lang.String str22 = dateTimeZone18.getID();
        java.lang.String str23 = dateTimeZone18.getID();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean27 = dateTimeZone18.equals((java.lang.Object) dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getNameKey((long) (byte) 1);
        boolean boolean30 = dateTimeZone26.isFixed();
        boolean boolean31 = dateTimeZone2.equals((java.lang.Object) boolean30);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone2.getShortName((-187320000L), locale33);
        java.lang.String str36 = dateTimeZone2.getName((long) 3600000);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 1);
        boolean boolean40 = dateTimeZone2.equals((java.lang.Object) 1);
        boolean boolean42 = dateTimeZone2.isStandardOffset((-115259966L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115079990L) + "'", long13 == (-115079990L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone1.getShortName(96L);
        int int13 = dateTimeZone1.getStandardOffset((-59900L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(0L, locale15);
        boolean boolean18 = dateTimeZone1.isStandardOffset(230399975L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone11.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone11.getName(1L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) 1);
        long long22 = dateTimeZone11.nextTransition(115200000L);
        long long24 = dateTimeZone11.previousTransition((long) 115200000);
        int int26 = dateTimeZone11.getOffset(233940000L);
        boolean boolean27 = dateTimeZone11.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200000L + "'", long24 == 115200000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.previousTransition((-230339999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-230339999L) + "'", long10 == (-230339999L));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        boolean boolean13 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.getName(115200032L);
        java.lang.String str16 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        int int12 = dateTimeZone2.getStandardOffset(32L);
        long long14 = dateTimeZone2.nextTransition((-230399903L));
        java.lang.String str15 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone16.convertUTCToLocal((-115139900L));
        long long20 = dateTimeZone16.previousTransition((long) (short) 0);
        boolean boolean21 = dateTimeZone2.equals((java.lang.Object) dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230399903L) + "'", long14 == (-230399903L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115139900L) + "'", long18 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.convertUTCToLocal((-115139900L));
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115139900L) + "'", long5 == (-115139900L));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone11.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone11.getName(1L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) 1);
        java.util.TimeZone timeZone21 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone25.getShortName((long) (byte) 10, locale27);
        long long30 = dateTimeZone25.convertUTCToLocal(0L);
        int int32 = dateTimeZone25.getStandardOffset((long) ' ');
        long long34 = dateTimeZone25.previousTransition(230399999L);
        java.lang.String str35 = dateTimeZone25.toString();
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone25.getShortName(43080000L, locale37);
        int int40 = dateTimeZone25.getStandardOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int44 = dateTimeZone42.getOffsetFromLocal((-1L));
        boolean boolean45 = dateTimeZone42.isFixed();
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone42.getOffset(readableInstant46);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone42.getShortName((long) 60000, locale49);
        long long54 = dateTimeZone42.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        boolean boolean56 = dateTimeZone25.equals((java.lang.Object) dateTimeZone42);
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeZone25.getName((-115139958L), locale58);
        long long61 = dateTimeZone25.nextTransition(3540000L);
        long long63 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, 43080010L);
        java.util.TimeZone timeZone64 = dateTimeZone23.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200000L + "'", long30 == 115200000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115200000 + "'", int32 == 115200000);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 230399999L + "'", long34 == 230399999L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 115200000 + "'", int40 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 115200000 + "'", int44 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 115200000 + "'", int47 == 115200000);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+32:00" + "'", str50, "+32:00");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-115199999L) + "'", long54 == (-115199999L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+32:00" + "'", str59, "+32:00");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 3540000L + "'", long61 == 3540000L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-72119990L) + "'", long63 == (-72119990L));
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((-115319900L));
        java.lang.String str12 = dateTimeZone8.getID();
        boolean boolean13 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName((-115139948L));
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.nextTransition(230399999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str16 = dateTimeZone1.getName((-72119990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 230399999L + "'", long13 == 230399999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126000000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        long long11 = dateTimeZone1.convertLocalToUTC((-115199900L), true);
        int int13 = dateTimeZone1.getOffset(35L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(187200000);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) 187200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230399900L) + "'", long11 == (-230399900L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getName(233880000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(115140000L, locale10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str14 = dateTimeZone1.getNameKey((long) (byte) 100);
        java.lang.String str15 = dateTimeZone1.getID();
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        int int16 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str18 = dateTimeZone1.getShortName((long) (short) -1);
        java.lang.String str20 = dateTimeZone1.getName(115140035L);
        java.lang.String str21 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        long long12 = dateTimeZone1.convertUTCToLocal(52L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName(0L, locale17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone21.getOffset(readableInstant22);
        long long25 = dateTimeZone15.getMillisKeepLocal(dateTimeZone21, (long) (byte) 10);
        long long29 = dateTimeZone15.convertLocalToUTC(115200000L, false, 0L);
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-115139900L));
        long long33 = dateTimeZone15.convertUTCToLocal(115139999L);
        java.lang.String str35 = dateTimeZone15.getNameKey((-115199990L));
        long long37 = dateTimeZone15.previousTransition((-302459900L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone15.getName(101L, locale39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200052L + "'", long12 == 115200052L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60010L + "'", long25 == 60010L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115140000L + "'", long29 == 115140000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 115199999L + "'", long33 == 115199999L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-302459900L) + "'", long37 == (-302459900L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:01" + "'", str40, "+00:01");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int3 = dateTimeZone1.getOffsetFromLocal(43020000L);
        int int5 = dateTimeZone1.getOffsetFromLocal(115140035L);
        long long8 = dateTimeZone1.convertLocalToUTC((-226859928L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-226859928L) + "'", long8 == (-226859928L));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition(115200052L);
        java.lang.String str6 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getShortName((-230279900L));
        java.lang.String str10 = dateTimeZone2.getName((-226859949L));
        long long13 = dateTimeZone2.adjustOffset((-359880010L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:10" + "'", str6, "+10:10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:10" + "'", str8, "+10:10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:10" + "'", str10, "+10:10");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-359880010L) + "'", long13 == (-359880010L));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-118799900L), locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.convertLocalToUTC((-302399948L), true, (long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-302399949L) + "'", long9 == (-302399949L));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone11.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone11.getName(1L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) 1);
        long long22 = dateTimeZone11.nextTransition(115200000L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName((long) (byte) 10, locale26);
        java.lang.String str29 = dateTimeZone24.getName(10L);
        long long31 = dateTimeZone11.getMillisKeepLocal(dateTimeZone24, (-115139900L));
        long long34 = dateTimeZone24.convertLocalToUTC(60010L, true);
        boolean boolean36 = dateTimeZone24.isStandardOffset(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        java.lang.String str38 = dateTimeZone24.toString();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone40.getShortName((long) (byte) 10, locale42);
        java.lang.String str45 = dateTimeZone40.getName(10L);
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone40.getOffset(readableInstant46);
        boolean boolean49 = dateTimeZone40.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        long long52 = dateTimeZone24.getMillisKeepLocal(dateTimeZone40, (-43139900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115139900L) + "'", long31 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-115139990L) + "'", long34 == (-115139990L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+32:00" + "'", str43, "+32:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:00" + "'", str45, "+32:00");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 115200000 + "'", int47 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-43139900L) + "'", long52 == (-43139900L));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getShortName((long) (byte) 10, locale15);
        java.lang.String str17 = dateTimeZone13.getID();
        boolean boolean19 = dateTimeZone13.isStandardOffset(10L);
        long long21 = dateTimeZone13.convertUTCToLocal(115199999L);
        int int23 = dateTimeZone13.getStandardOffset((-1L));
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 118800000L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone13.getShortName((-115259966L), locale27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone13.getOffset(readableInstant29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 230399999L + "'", long21 == 230399999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 118800000L + "'", long25 == 118800000L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int10 = dateTimeZone8.getOffsetFromLocal((long) 10);
        boolean boolean11 = dateTimeZone6.equals((java.lang.Object) 10);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getOffset(115200010L);
        long long19 = dateTimeZone15.previousTransition((long) '4');
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone15, 115200010L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone6.getName((-704939949L), locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 302460010L + "'", long21 == 302460010L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+52:01" + "'", str24, "+52:01");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        int int8 = dateTimeZone1.getOffset(0L);
        long long11 = dateTimeZone1.adjustOffset((-359880000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-359880000L) + "'", long11 == (-359880000L));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        int int9 = dateTimeZone1.getOffsetFromLocal(230339999L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(100L, locale11);
        java.lang.String str14 = dateTimeZone1.getNameKey(115199900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        java.lang.String str17 = dateTimeZone1.getNameKey((-187320000L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(115140035L, locale19);
        java.lang.String str22 = dateTimeZone1.getName(187200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long7 = dateTimeZone1.adjustOffset((-111540000L), false);
        long long9 = dateTimeZone1.previousTransition((-589739949L));
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.previousTransition((-1L));
        int int15 = dateTimeZone11.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone17.getName((long) (-1), locale22);
        long long26 = dateTimeZone17.convertLocalToUTC((long) (short) -1, false);
        int int28 = dateTimeZone17.getOffsetFromLocal((long) 115200000);
        long long31 = dateTimeZone17.adjustOffset((long) (byte) -1, false);
        int int33 = dateTimeZone17.getOffsetFromLocal((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone17.getOffset(readableInstant34);
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone17.isLocalDateTimeGap(localDateTime36);
        long long39 = dateTimeZone11.getMillisKeepLocal(dateTimeZone17, (long) (-1));
        long long41 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) 600000);
        long long43 = dateTimeZone11.previousTransition(115260000L);
        java.util.TimeZone timeZone44 = dateTimeZone11.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-111540000L) + "'", long7 == (-111540000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-589739949L) + "'", long9 == (-589739949L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115200001L) + "'", long26 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 600000L + "'", long41 == 600000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 115260000L + "'", long43 == 115260000L);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        java.lang.String str3 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115200000 + "'", int2 == 115200000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:10");
        long long4 = dateTimeZone1.adjustOffset((long) '4', false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone5.getID();
        long long10 = dateTimeZone5.previousTransition((-1L));
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-115199899L));
        boolean boolean14 = dateTimeZone5.isStandardOffset(187260000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-229799899L) + "'", long12 == (-229799899L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getName(0L, locale7);
        long long12 = dateTimeZone3.convertLocalToUTC((-114599949L), true, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-229799949L) + "'", long12 == (-229799949L));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone4.getName((long) (byte) -1, locale13);
        long long16 = dateTimeZone4.previousTransition(60010L);
        java.lang.String str17 = dateTimeZone4.toString();
        int int19 = dateTimeZone4.getOffset((-229799949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60010L + "'", long16 == 60010L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        int int12 = dateTimeZone1.getStandardOffset((-230339999L));
        java.lang.String str13 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        boolean boolean19 = dateTimeZone18.isFixed();
        int int21 = dateTimeZone18.getStandardOffset(230399999L);
        java.lang.String str23 = dateTimeZone18.getShortName((long) 60000);
        boolean boolean24 = dateTimeZone1.equals((java.lang.Object) str23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone26.getShortName((long) (byte) 10, locale28);
        java.lang.String str31 = dateTimeZone26.getName(10L);
        java.lang.String str32 = dateTimeZone26.toString();
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone26.getShortName(115139999L, locale34);
        java.lang.String str37 = dateTimeZone26.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone39.getShortName((long) (byte) 10, locale41);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone39.getName((long) (-1), locale44);
        boolean boolean46 = dateTimeZone39.isFixed();
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone39.isLocalDateTimeGap(localDateTime47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = dateTimeZone39.getOffset(readableInstant49);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long55 = dateTimeZone52.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone56 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        boolean boolean59 = dateTimeZone39.equals((java.lang.Object) dateTimeZone58);
        java.lang.String str60 = dateTimeZone58.getID();
        boolean boolean61 = dateTimeZone26.equals((java.lang.Object) dateTimeZone58);
        long long63 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, 114600000L);
        java.util.Locale locale65 = null;
        java.lang.String str66 = dateTimeZone1.getName(115259900L, locale65);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 600000 + "'", int21 == 600000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:10" + "'", str23, "+00:10");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+32:00" + "'", str42, "+32:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:00" + "'", str45, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 115200000 + "'", int50 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 115200052L + "'", long55 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:01" + "'", str60, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 114600000L + "'", long63 == 114600000L);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+32:00" + "'", str66, "+32:00");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getNameKey((long) (byte) 1);
        boolean boolean13 = dateTimeZone9.isFixed();
        boolean boolean14 = dateTimeZone9.isFixed();
        java.lang.String str16 = dateTimeZone9.getNameKey(118799999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone11.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone11.getName(1L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) 1);
        long long22 = dateTimeZone11.nextTransition(115200000L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName((long) (byte) 10, locale26);
        java.lang.String str29 = dateTimeZone24.getName(10L);
        long long31 = dateTimeZone11.getMillisKeepLocal(dateTimeZone24, (-115139900L));
        long long34 = dateTimeZone24.convertLocalToUTC(60010L, true);
        boolean boolean36 = dateTimeZone24.isStandardOffset(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        boolean boolean38 = dateTimeZone24.isFixed();
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone24.getName((-111599948L), locale40);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115139900L) + "'", long31 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-115139990L) + "'", long34 == (-115139990L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(600000);
        java.lang.String str3 = dateTimeZone1.getNameKey((-229799990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long19 = dateTimeZone1.convertUTCToLocal((long) 187200000);
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 302400000L + "'", long19 == 302400000L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) 10);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (short) 100);
        boolean boolean7 = dateTimeZone1.isStandardOffset(100L);
        boolean boolean9 = dateTimeZone1.isStandardOffset(115260000L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-115139999L));
        java.lang.String str13 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getName((long) 'a');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName((-115199903L), locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((-115199998L), locale7);
        boolean boolean10 = dateTimeZone0.isStandardOffset(114599999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coordinated Universal Time" + "'", str2, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        long long10 = dateTimeZone1.previousTransition(52L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        java.lang.String str14 = dateTimeZone11.getID();
        long long16 = dateTimeZone11.previousTransition((-1L));
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 115200010L);
        int int20 = dateTimeZone1.getStandardOffset(120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200010L + "'", long18 == 115200010L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str9 = dateTimeZone1.getName((-230399958L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone1.getName(0L);
        java.lang.String str15 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone1.getName(0L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        long long19 = dateTimeZone1.convertLocalToUTC((-115139965L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230339965L) + "'", long19 == (-230339965L));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str7 = dateTimeZone1.getShortName(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj11 = null;
        boolean boolean12 = dateTimeZone10.equals(obj11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        boolean boolean15 = dateTimeZone10.isStandardOffset((-230339900L));
        long long18 = dateTimeZone10.adjustOffset(101L, true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getName(10L, locale22);
        boolean boolean24 = dateTimeZone20.isFixed();
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone20.getOffset(readableInstant25);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone20, (-111540000L));
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) (-111540000L));
        java.lang.String str31 = dateTimeZone1.getShortName(230399997L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 101L + "'", long18 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-111480100L) + "'", long28 == (-111480100L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 1);
        java.lang.String str4 = dateTimeZone2.getNameKey((-589739949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone4.getName((long) (byte) -1, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone4.getShortName(60010L, locale16);
        long long21 = dateTimeZone4.convertLocalToUTC(43139999L, false, (long) (short) 0);
        java.lang.String str22 = dateTimeZone4.toString();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone4.getName((-183660000L), locale24);
        long long28 = dateTimeZone4.adjustOffset(115200100L, true);
        int int30 = dateTimeZone4.getOffset(114600010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-72060001L) + "'", long21 == (-72060001L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115200100L + "'", long28 == 115200100L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) (byte) 10, locale5);
        java.lang.String str8 = dateTimeZone3.getName(10L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone3.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone3.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getShortName((long) (byte) 10, locale18);
        java.lang.String str20 = dateTimeZone16.getID();
        java.lang.String str21 = dateTimeZone16.getID();
        java.lang.String str23 = dateTimeZone16.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone16.getOffset(readableInstant24);
        long long27 = dateTimeZone16.convertUTCToLocal((long) (byte) 1);
        java.util.TimeZone timeZone28 = dateTimeZone16.toTimeZone();
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) timeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199958L) + "'", long14 == (-115199958L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115200001L + "'", long27 == 115200001L);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(1L, locale4);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230099990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:10" + "'", str5, "+00:10");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        long long16 = dateTimeZone11.convertUTCToLocal(0L);
        int int18 = dateTimeZone11.getStandardOffset((long) ' ');
        long long20 = dateTimeZone11.previousTransition(230399999L);
        java.lang.String str21 = dateTimeZone11.toString();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone11.getShortName(43080000L, locale23);
        boolean boolean26 = dateTimeZone11.isStandardOffset(230399999L);
        boolean boolean27 = dateTimeZone9.equals((java.lang.Object) dateTimeZone11);
        java.lang.String str28 = dateTimeZone11.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115200000L + "'", long16 == 115200000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 230399999L + "'", long20 == 230399999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int10 = dateTimeZone8.getOffsetFromLocal((-1L));
        boolean boolean11 = dateTimeZone8.isFixed();
        long long13 = dateTimeZone8.convertUTCToLocal((long) 10);
        boolean boolean15 = dateTimeZone8.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone8.isLocalDateTimeGap(localDateTime16);
        long long21 = dateTimeZone8.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str23 = dateTimeZone8.getNameKey((long) 115200000);
        long long26 = dateTimeZone8.adjustOffset((-115139990L), true);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) long26);
        java.lang.String str29 = dateTimeZone1.getName((-118740000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115200010L + "'", long13 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115139990L) + "'", long26 == (-115139990L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) (byte) 10, locale12);
        java.lang.String str15 = dateTimeZone10.getName(10L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        boolean boolean19 = dateTimeZone10.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone10.isLocalDateTimeGap(localDateTime21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-1L));
        int int26 = dateTimeZone10.getOffset((-230339999L));
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone10.getOffset(readableInstant27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone10.getShortName((-341939900L), locale30);
        boolean boolean33 = dateTimeZone10.isStandardOffset((-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean12 = dateTimeZone1.isStandardOffset((-302459900L));
        java.lang.String str14 = dateTimeZone1.getNameKey(43020000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone1.adjustOffset((-115140001L), true);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115140001L) + "'", long10 == (-115140001L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 'a');
        int int10 = dateTimeZone1.getStandardOffset((-187260000L));
        long long12 = dateTimeZone1.previousTransition((-230459903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-230459903L) + "'", long12 == (-230459903L));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long7 = dateTimeZone1.adjustOffset((-111540000L), false);
        java.lang.String str8 = dateTimeZone1.toString();
        boolean boolean9 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-111540000L) + "'", long7 == (-111540000L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        long long15 = dateTimeZone1.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        java.lang.String str21 = dateTimeZone17.getID();
        java.lang.String str22 = dateTimeZone17.getID();
        java.lang.String str23 = dateTimeZone17.getID();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone17.getOffset(readableInstant24);
        int int27 = dateTimeZone17.getStandardOffset(230340010L);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long31 = dateTimeZone1.convertUTCToLocal(3659903L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 118859903L + "'", long31 == 118859903L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        boolean boolean3 = dateTimeZone2.isFixed();
        int int5 = dateTimeZone2.getStandardOffset(230399999L);
        java.lang.String str7 = dateTimeZone2.getNameKey(115200032L);
        long long9 = dateTimeZone2.nextTransition(115200010L);
        java.lang.String str11 = dateTimeZone2.getShortName(115800000L);
        java.lang.String str13 = dateTimeZone2.getName((-345599896L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 600000 + "'", int5 == 600000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115200010L + "'", long9 == 115200010L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:10" + "'", str11, "+00:10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:10" + "'", str13, "+00:10");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, (long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone17.isLocalDateTimeGap(localDateTime21);
        int int24 = dateTimeZone17.getStandardOffset((long) 360000000);
        long long26 = dateTimeZone17.convertUTCToLocal((-115199998L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int3 = dateTimeZone1.getOffsetFromLocal(43020000L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(158339999L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getNameKey((long) (byte) 1);
        boolean boolean13 = dateTimeZone9.isFixed();
        boolean boolean14 = dateTimeZone9.isFixed();
        long long17 = dateTimeZone9.adjustOffset((-359399949L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-359399949L) + "'", long17 == (-359399949L));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long5 = dateTimeZone0.adjustOffset(0L, false);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((-115199903L), locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115200000 + "'", int2 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.lang.String str3 = dateTimeZone1.getNameKey((-600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60000L + "'", long3 == 60000L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean9 = dateTimeZone1.isFixed();
        boolean boolean10 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getShortName((long) (byte) 10, locale14);
        int int17 = dateTimeZone12.getOffsetFromLocal((long) (byte) 1);
        java.lang.String str19 = dateTimeZone12.getNameKey((long) 115200000);
        int int21 = dateTimeZone12.getOffsetFromLocal(115200000L);
        boolean boolean23 = dateTimeZone12.isStandardOffset((long) 115200000);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.previousTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone25.isLocalDateTimeGap(localDateTime28);
        java.lang.String str30 = dateTimeZone25.toString();
        java.lang.String str32 = dateTimeZone25.getShortName(115200035L);
        java.lang.String str34 = dateTimeZone25.getName((-345599903L));
        long long36 = dateTimeZone12.getMillisKeepLocal(dateTimeZone25, (long) 1);
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-345539900L));
        int int40 = dateTimeZone1.getOffset((-341939900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115200000 + "'", int21 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 115199901L + "'", long36 == 115199901L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-345539900L) + "'", long38 == (-345539900L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 115200000 + "'", int40 == 115200000);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 60000);
        java.lang.String str17 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, (-187260001L));
        long long23 = dateTimeZone1.convertUTCToLocal((-230460003L));
        boolean boolean24 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-72060002L) + "'", long21 == (-72060002L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115260003L) + "'", long23 == (-115260003L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        java.lang.String str17 = dateTimeZone1.getShortName((-302459900L));
        boolean boolean18 = dateTimeZone1.isFixed();
        java.lang.String str20 = dateTimeZone1.getName((-3599901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        int int14 = dateTimeZone1.getStandardOffset((-115199990L));
        java.lang.String str15 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        int int19 = dateTimeZone1.getOffset((-35999899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 1);
        long long6 = dateTimeZone1.adjustOffset((-338459899L), false);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-338459899L) + "'", long6 == (-338459899L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 60000);
        java.lang.String str17 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long20 = dateTimeZone1.convertUTCToLocal(400200000L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getName(115199900L, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 515400000L + "'", long20 == 515400000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int10 = dateTimeZone8.getOffsetFromLocal((-1L));
        boolean boolean11 = dateTimeZone8.isFixed();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone8.getOffset(readableInstant12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getShortName((long) 60000, locale15);
        long long20 = dateTimeZone8.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.TimeZone timeZone22 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        long long27 = dateTimeZone8.getMillisKeepLocal(dateTimeZone24, (long) (byte) 10);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) dateTimeZone24);
        int int30 = dateTimeZone1.getOffset((-230879990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115199999L) + "'", long20 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        long long17 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str20 = dateTimeZone1.getNameKey((-35999899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str3 = dateTimeZone1.getName(302400010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:00" + "'", str3, "+97:00");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        long long17 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str20 = dateTimeZone1.getName((-115199903L));
        int int22 = dateTimeZone1.getStandardOffset((-115139999L));
        java.lang.String str23 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        int int11 = dateTimeZone1.getOffsetFromLocal((-115199900L));
        boolean boolean12 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, (-229799949L));
        boolean boolean17 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-474599949L) + "'", long16 == (-474599949L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.nextTransition((-230399900L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName(0L, locale15);
        java.lang.String str17 = dateTimeZone1.getID();
        java.lang.String str18 = dateTimeZone1.getID();
        long long21 = dateTimeZone1.adjustOffset(3600101L, true);
        boolean boolean22 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600101L + "'", long21 == 3600101L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        boolean boolean9 = dateTimeZone2.isStandardOffset((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        java.lang.String str15 = dateTimeZone11.getID();
        boolean boolean17 = dateTimeZone11.isStandardOffset(10L);
        int int19 = dateTimeZone11.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName((long) (byte) 10, locale23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone21.getOffset(readableInstant25);
        java.lang.String str28 = dateTimeZone21.getName(1L);
        long long30 = dateTimeZone11.getMillisKeepLocal(dateTimeZone21, (long) (short) 1);
        long long32 = dateTimeZone21.nextTransition(115200000L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone34.getShortName((long) (byte) 10, locale36);
        java.lang.String str39 = dateTimeZone34.getName(10L);
        long long41 = dateTimeZone21.getMillisKeepLocal(dateTimeZone34, (-115139900L));
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean44 = dateTimeZone43.isFixed();
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone43.getName((long) 0, locale46);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int52 = dateTimeZone50.getOffsetFromLocal((-1L));
        boolean boolean53 = dateTimeZone50.isFixed();
        org.joda.time.ReadableInstant readableInstant54 = null;
        int int55 = dateTimeZone50.getOffset(readableInstant54);
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone50.getShortName((long) 60000, locale57);
        long long62 = dateTimeZone50.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        java.util.TimeZone timeZone64 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone67 = dateTimeZone66.toTimeZone();
        long long69 = dateTimeZone50.getMillisKeepLocal(dateTimeZone66, (long) (byte) 10);
        boolean boolean70 = dateTimeZone43.equals((java.lang.Object) dateTimeZone66);
        boolean boolean71 = dateTimeZone21.equals((java.lang.Object) dateTimeZone66);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long74 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, (-230279990L));
        int int76 = dateTimeZone2.getOffsetFromLocal((-229859900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 115200000L + "'", long32 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-115139900L) + "'", long41 == (-115139900L));
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Coordinated Universal Time" + "'", str47, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 115200000 + "'", int52 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 115200000 + "'", int55 == 115200000);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+32:00" + "'", str58, "+32:00");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-115199999L) + "'", long62 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-345419990L) + "'", long74 == (-345419990L));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 60000 + "'", int76 == 60000);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        long long11 = dateTimeZone1.adjustOffset((-115139900L), true);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int19 = dateTimeZone17.getOffsetFromLocal((-1L));
        boolean boolean20 = dateTimeZone17.isFixed();
        long long22 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, 1L);
        int int24 = dateTimeZone17.getOffsetFromLocal((long) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone26.getShortName((long) (byte) 10, locale28);
        java.lang.String str30 = dateTimeZone26.getID();
        java.lang.String str31 = dateTimeZone26.getID();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean35 = dateTimeZone26.equals((java.lang.Object) dateTimeZone34);
        java.lang.String str37 = dateTimeZone34.getNameKey((long) (byte) 1);
        boolean boolean38 = dateTimeZone34.isFixed();
        long long40 = dateTimeZone17.getMillisKeepLocal(dateTimeZone34, 115140000L);
        long long44 = dateTimeZone34.convertLocalToUTC((-115199900L), false, 60010L);
        int int46 = dateTimeZone34.getOffsetFromLocal((-115140000L));
        long long50 = dateTimeZone34.convertLocalToUTC((-230400000L), true, (-120001L));
        boolean boolean51 = dateTimeZone1.equals((java.lang.Object) long50);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 43080000L + "'", long40 == 43080000L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-302459900L) + "'", long44 == (-302459900L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 187260000 + "'", int46 == 187260000);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-417660000L) + "'", long50 == (-417660000L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:10");
        long long4 = dateTimeZone1.adjustOffset((long) '4', false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone5.getID();
        long long10 = dateTimeZone5.previousTransition((-1L));
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-115199899L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone5.getName((long) 35, locale14);
        long long18 = dateTimeZone5.convertLocalToUTC((long) 35, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-229799899L) + "'", long12 == (-229799899L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115199965L) + "'", long18 == (-115199965L));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int3 = dateTimeZone1.getOffsetFromLocal(43020000L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.convertLocalToUTC((-187320000L), true);
        long long13 = dateTimeZone1.convertLocalToUTC((-187259947L), false, 34L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-187320000L) + "'", long9 == (-187320000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-187259947L) + "'", long13 == (-187259947L));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone5.getOffset(readableInstant9);
        int int12 = dateTimeZone5.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone13 = dateTimeZone5.toTimeZone();
        long long17 = dateTimeZone5.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.lang.String str19 = dateTimeZone5.getName((long) (short) -1);
        java.lang.String str20 = dateTimeZone5.toString();
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-72060000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long25 = dateTimeZone1.nextTransition((-187260001L));
        int int27 = dateTimeZone1.getOffsetFromLocal(230279999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-230399903L) + "'", long17 == (-230399903L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-183660000L) + "'", long22 == (-183660000L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-187260001L) + "'", long25 == (-187260001L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3600000 + "'", int27 == 3600000);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getShortName((long) (byte) 10, locale18);
        java.lang.String str21 = dateTimeZone16.getName(10L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 115200010L);
        java.lang.String str24 = dateTimeZone16.getID();
        long long26 = dateTimeZone16.previousTransition(43080000L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone16.getShortName((long) 1, locale28);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long33 = dateTimeZone31.previousTransition((long) (byte) -1);
        long long37 = dateTimeZone31.convertLocalToUTC(115199999L, true, (long) '#');
        java.lang.String str39 = dateTimeZone31.getNameKey((long) (byte) -1);
        long long42 = dateTimeZone31.convertLocalToUTC((-115200000L), false);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone31.getName((-115139958L), locale44);
        boolean boolean46 = dateTimeZone16.equals((java.lang.Object) locale44);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115200010L + "'", long23 == 115200010L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 43080000L + "'", long26 == 43080000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 111599999L + "'", long37 == 111599999L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-118800000L) + "'", long42 == (-118800000L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+01:00" + "'", str45, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getNameKey(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj16 = null;
        boolean boolean17 = dateTimeZone15.equals(obj16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        int int20 = dateTimeZone15.getOffsetFromLocal((long) (short) -1);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-589799949L));
        java.util.TimeZone timeZone23 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-474659949L) + "'", long22 == (-474659949L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone11.getName((long) (-1), locale16);
        long long20 = dateTimeZone11.convertLocalToUTC((long) (short) -1, false);
        int int22 = dateTimeZone11.getOffsetFromLocal((long) 115200000);
        long long25 = dateTimeZone11.convertLocalToUTC((-115199998L), true);
        long long27 = dateTimeZone11.previousTransition((long) (byte) 10);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 118800010L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone31.getShortName((long) (byte) 10, locale33);
        java.lang.String str35 = dateTimeZone31.getID();
        java.lang.String str36 = dateTimeZone31.getID();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean40 = dateTimeZone31.equals((java.lang.Object) dateTimeZone39);
        java.lang.String str42 = dateTimeZone39.getNameKey((long) (byte) 1);
        boolean boolean43 = dateTimeZone39.isFixed();
        java.util.TimeZone timeZone44 = dateTimeZone39.toTimeZone();
        int int46 = dateTimeZone39.getStandardOffset((-345599965L));
        java.lang.String str47 = dateTimeZone39.getID();
        java.lang.String str48 = dateTimeZone39.toString();
        long long50 = dateTimeZone39.convertUTCToLocal(115140000L);
        boolean boolean51 = dateTimeZone11.equals((java.lang.Object) dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115200001L) + "'", long20 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-230399998L) + "'", long25 == (-230399998L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 118800010L + "'", long29 == 118800010L);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 187260000 + "'", int46 == 187260000);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+52:01" + "'", str47, "+52:01");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+52:01" + "'", str48, "+52:01");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 302400000L + "'", long50 == 302400000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (long) (byte) 10);
        int int14 = dateTimeZone2.getOffsetFromLocal((long) 361920000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(115200010L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int18 = dateTimeZone16.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getShortName((-230399903L));
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-3659900L));
        java.util.TimeZone timeZone26 = dateTimeZone20.toTimeZone();
        java.lang.String str27 = dateTimeZone20.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 111540100L + "'", long25 == 111540100L);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int9 = dateTimeZone7.getOffsetFromLocal((-1L));
        boolean boolean10 = dateTimeZone7.isFixed();
        long long12 = dateTimeZone7.convertUTCToLocal((long) 10);
        int int14 = dateTimeZone7.getStandardOffset((-115200001L));
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-115259949L));
        java.util.TimeZone timeZone17 = dateTimeZone7.toTimeZone();
        java.lang.String str19 = dateTimeZone7.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-226859949L) + "'", long16 == (-226859949L));
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getShortName((long) (byte) 10, locale15);
        java.lang.String str17 = dateTimeZone13.getID();
        java.lang.String str18 = dateTimeZone13.getID();
        java.lang.String str19 = dateTimeZone13.getID();
        java.lang.String str21 = dateTimeZone13.getNameKey((long) (byte) -1);
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) str21);
        java.util.TimeZone timeZone23 = dateTimeZone1.toTimeZone();
        long long26 = dateTimeZone1.convertLocalToUTC(302400010L, false);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone1.getShortName((-115139965L), locale28);
        long long31 = dateTimeZone1.nextTransition(115140000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 187200010L + "'", long26 == 187200010L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115140000L + "'", long31 == 115140000L);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str6 = dateTimeZone1.toString();
        long long9 = dateTimeZone1.adjustOffset(115199999L, true);
        long long11 = dateTimeZone1.nextTransition((-589739949L));
        long long14 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115199999L + "'", long9 == 115199999L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-589739949L) + "'", long11 == (-589739949L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.lang.String str7 = dateTimeZone1.toString();
        long long10 = dateTimeZone1.adjustOffset((long) 360000000, true);
        java.lang.String str12 = dateTimeZone1.getName((-115259899L));
        int int14 = dateTimeZone1.getStandardOffset(3719900L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 360000000L + "'", long10 == 360000000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        long long5 = dateTimeZone1.convertUTCToLocal(115200000L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.lang.String str11 = dateTimeZone7.getID();
        java.lang.String str12 = dateTimeZone7.getID();
        java.lang.String str14 = dateTimeZone7.getShortName(1L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 43080000L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getShortName(115200001L, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115200000L + "'", long5 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-72120000L) + "'", long16 == (-72120000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        int int10 = dateTimeZone1.getStandardOffset(230399999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition((-115139999L));
        java.lang.String str5 = dateTimeZone2.getID();
        int int7 = dateTimeZone2.getOffset(72059975L);
        java.lang.String str9 = dateTimeZone2.getShortName((-115259948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139999L) + "'", long4 == (-115139999L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:10" + "'", str5, "+00:10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 600000 + "'", int7 == 600000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:10" + "'", str9, "+00:10");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        java.lang.String str11 = dateTimeZone1.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(43080000L, locale13);
        boolean boolean16 = dateTimeZone1.isStandardOffset(230399999L);
        java.lang.String str17 = dateTimeZone1.getID();
        java.lang.String str18 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        long long24 = dateTimeZone1.convertLocalToUTC((-111480100L), true, (long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-226680100L) + "'", long24 == (-226680100L));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName((-115139948L));
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.nextTransition((-97L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        long long3 = dateTimeZone1.nextTransition((-115139958L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getShortName((-230399903L));
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) (-230399903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115139958L) + "'", long3 == (-115139958L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((-230460000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-230460000L) + "'", long5 == (-230460000L));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, (long) (byte) 10);
        java.util.TimeZone timeZone21 = dateTimeZone17.toTimeZone();
        long long24 = dateTimeZone17.adjustOffset((-230339903L), true);
        int int26 = dateTimeZone17.getOffset((-151199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-230339903L) + "'", long24 == (-230339903L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone11.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone11.getName(1L);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) 1);
        long long22 = dateTimeZone11.nextTransition(115200000L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName((long) (byte) 10, locale26);
        java.lang.String str29 = dateTimeZone24.getName(10L);
        long long31 = dateTimeZone11.getMillisKeepLocal(dateTimeZone24, (-115139900L));
        java.lang.String str32 = dateTimeZone11.toString();
        java.lang.Class<?> wildcardClass33 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115139900L) + "'", long31 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertUTCToLocal((-115259980L));
        long long8 = dateTimeZone1.nextTransition(97L);
        long long11 = dateTimeZone1.convertLocalToUTC(118740000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-59980L) + "'", long6 == (-59980L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3540000L + "'", long11 == 3540000L);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) 100);
        java.lang.Object obj14 = null;
        boolean boolean15 = dateTimeZone1.equals(obj14);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getName((-345419990L), locale18);
        java.lang.String str20 = dateTimeZone1.toString();
        long long23 = dateTimeZone1.convertLocalToUTC((-115139899L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-230339899L) + "'", long23 == (-230339899L));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        boolean boolean15 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399903L) + "'", long13 == (-230399903L));
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        java.lang.String str11 = dateTimeZone1.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(43080000L, locale13);
        boolean boolean16 = dateTimeZone1.isStandardOffset(230399999L);
        int int18 = dateTimeZone1.getOffset(230399999L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int22 = dateTimeZone20.getOffsetFromLocal((-1L));
        boolean boolean23 = dateTimeZone20.isFixed();
        long long25 = dateTimeZone20.convertUTCToLocal((long) 10);
        int int27 = dateTimeZone20.getStandardOffset((-115200001L));
        int int29 = dateTimeZone20.getStandardOffset((-115139999L));
        int int31 = dateTimeZone20.getStandardOffset((-230339999L));
        java.lang.String str32 = dateTimeZone20.toString();
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone20.isLocalDateTimeGap(localDateTime33);
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-229859900L));
        int int38 = dateTimeZone20.getOffset((-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 115200010L + "'", long25 == 115200010L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115200000 + "'", int29 == 115200000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-229859900L) + "'", long36 == (-229859900L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 115200000 + "'", int38 == 115200000);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        java.lang.String str15 = dateTimeZone1.getID();
        java.lang.String str17 = dateTimeZone1.getName(97L);
        boolean boolean18 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) -1, true);
        long long18 = dateTimeZone4.previousTransition((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getShortName((long) (byte) 10, locale22);
        java.lang.String str24 = dateTimeZone20.getID();
        boolean boolean26 = dateTimeZone20.isStandardOffset(10L);
        int int28 = dateTimeZone20.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone30.getShortName((long) (byte) 10, locale32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone30.getOffset(readableInstant34);
        java.lang.String str37 = dateTimeZone30.getName(1L);
        long long39 = dateTimeZone20.getMillisKeepLocal(dateTimeZone30, (long) (short) 1);
        boolean boolean41 = dateTimeZone30.isStandardOffset((-230399903L));
        boolean boolean42 = dateTimeZone30.isFixed();
        java.lang.String str44 = dateTimeZone30.getNameKey((-115199900L));
        boolean boolean45 = dateTimeZone4.equals((java.lang.Object) (-115199900L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone4.isLocalDateTimeGap(localDateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115200001L) + "'", long16 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone5.getOffset(readableInstant9);
        int int12 = dateTimeZone5.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone13 = dateTimeZone5.toTimeZone();
        long long17 = dateTimeZone5.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.lang.String str19 = dateTimeZone5.getName((long) (short) -1);
        java.lang.String str20 = dateTimeZone5.toString();
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-72060000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long25 = dateTimeZone1.nextTransition((-187260001L));
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone1.getOffset(readableInstant26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-230399903L) + "'", long17 == (-230399903L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-183660000L) + "'", long22 == (-183660000L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-187260001L) + "'", long25 == (-187260001L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3600000 + "'", int27 == 3600000);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str5 = dateTimeZone3.getShortName((-1L));
        long long7 = dateTimeZone3.previousTransition(60032L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60032L + "'", long7 == 60032L);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        long long7 = dateTimeZone3.convertUTCToLocal((-1L));
        java.lang.String str9 = dateTimeZone3.getName((-1L));
        java.util.TimeZone timeZone10 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 43080000L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int18 = dateTimeZone16.getOffsetFromLocal((-1L));
        boolean boolean19 = dateTimeZone16.isFixed();
        long long21 = dateTimeZone16.convertUTCToLocal((long) 10);
        boolean boolean23 = dateTimeZone16.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone16.isLocalDateTimeGap(localDateTime24);
        long long27 = dateTimeZone16.nextTransition(10L);
        long long29 = dateTimeZone16.previousTransition((-115199900L));
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone31.getShortName((long) (byte) 10, locale33);
        java.lang.String str36 = dateTimeZone31.getName(10L);
        long long38 = dateTimeZone16.getMillisKeepLocal(dateTimeZone31, 115200010L);
        boolean boolean40 = dateTimeZone31.isStandardOffset(115200000L);
        long long43 = dateTimeZone31.adjustOffset(32L, true);
        boolean boolean44 = dateTimeZone12.equals((java.lang.Object) true);
        int int46 = dateTimeZone12.getStandardOffset((-115199998L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115199999L + "'", long7 == 115199999L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 43080010L + "'", long14 == 43080010L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115200010L + "'", long21 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115199900L) + "'", long29 == (-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 115200010L + "'", long38 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-115199949L), locale9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.nextTransition((-115259900L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (byte) 10, locale7);
        java.lang.String str10 = dateTimeZone5.getName(10L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone5.getOffset(readableInstant11);
        boolean boolean14 = dateTimeZone5.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str17 = dateTimeZone5.getName((-115079990L));
        int int19 = dateTimeZone5.getOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str23 = dateTimeZone22.toString();
        long long25 = dateTimeZone22.nextTransition((long) (byte) -1);
        int int27 = dateTimeZone22.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long30 = dateTimeZone5.getMillisKeepLocal(dateTimeZone22, (-230339900L));
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone22.isLocalDateTimeGap(localDateTime31);
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, (-230399958L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115259900L) + "'", long3 == (-115259900L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-115199900L) + "'", long30 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-230459959L) + "'", long34 == (-230459959L));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.previousTransition((long) (byte) -1);
        boolean boolean9 = dateTimeZone5.isStandardOffset((long) '#');
        java.lang.String str11 = dateTimeZone5.getNameKey((-115139948L));
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 3600000L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone5.getShortName(201L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540000L + "'", long13 == 3540000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey((-115139948L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(230279999L, locale9);
        long long12 = dateTimeZone1.convertUTCToLocal((-115080001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str15 = dateTimeZone1.getShortName((-115259958L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115020001L) + "'", long12 == (-115020001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone1.getName((long) ' ');
        int int18 = dateTimeZone1.getStandardOffset((long) (byte) 1);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        java.lang.String str10 = dateTimeZone1.getName(115200001L);
        long long12 = dateTimeZone1.convertUTCToLocal((-59900L));
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115140100L + "'", long12 == 115140100L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.nextTransition(230399999L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((long) 60000, locale15);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        boolean boolean20 = dateTimeZone18.isStandardOffset(230339910L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 230399999L + "'", long13 == 230399999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long9 = dateTimeZone6.adjustOffset((long) 10, false);
        boolean boolean10 = dateTimeZone6.isFixed();
        int int12 = dateTimeZone6.getStandardOffset(3480062L);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 360000000L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone6.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 363540000L + "'", long14 == 363540000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long5 = dateTimeZone1.nextTransition((-115800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115800000L) + "'", long5 == (-115800000L));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone1.getName((long) ' ');
        int int18 = dateTimeZone1.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getShortName((long) (byte) 10, locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone20.getName((long) (-1), locale25);
        long long29 = dateTimeZone20.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str30 = dateTimeZone20.getID();
        int int32 = dateTimeZone20.getOffset((long) (byte) 100);
        java.lang.String str33 = dateTimeZone20.toString();
        int int35 = dateTimeZone20.getOffset(187200000L);
        long long37 = dateTimeZone20.convertUTCToLocal((-151199899L));
        long long39 = dateTimeZone20.previousTransition((-230399958L));
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) long39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115200001L) + "'", long29 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115200000 + "'", int32 == 115200000);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-35999899L) + "'", long37 == (-35999899L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-230399958L) + "'", long39 == (-230399958L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115140010L);
        java.lang.String str7 = dateTimeZone1.getName(115200052L);
        long long10 = dateTimeZone1.adjustOffset(10L, false);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118740062L + "'", long5 == 118740062L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.052" + "'", str7, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((long) '#');
        java.lang.String str15 = dateTimeZone4.getNameKey((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName((long) (byte) 10, locale23);
        java.lang.String str25 = dateTimeZone21.getID();
        long long27 = dateTimeZone21.convertUTCToLocal((-230339900L));
        long long29 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, 60010L);
        long long31 = dateTimeZone4.getMillisKeepLocal(dateTimeZone18, (long) '#');
        boolean boolean32 = dateTimeZone4.isFixed();
        boolean boolean33 = dateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115139900L) + "'", long27 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115079990L) + "'", long29 == (-115079990L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115140035L + "'", long31 == 115140035L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(115139999L, locale9);
        int int12 = dateTimeZone1.getStandardOffset((-230340000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        int int12 = dateTimeZone5.getOffsetFromLocal((long) 10);
        long long15 = dateTimeZone5.convertLocalToUTC((long) (short) 100, true);
        long long17 = dateTimeZone5.previousTransition((-1L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone5.getShortName((-115140000L), locale19);
        int int22 = dateTimeZone5.getOffset(115139999L);
        long long24 = dateTimeZone5.nextTransition((long) (-3600000));
        long long27 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199900L) + "'", long15 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3600000L) + "'", long24 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115199999L) + "'", long27 == (-115199999L));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        long long9 = dateTimeZone1.nextTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone1.getStandardOffset((-115080090L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int18 = dateTimeZone16.getOffsetFromLocal((-1L));
        boolean boolean19 = dateTimeZone16.isFixed();
        long long21 = dateTimeZone16.convertUTCToLocal(0L);
        int int23 = dateTimeZone16.getOffset(115200010L);
        boolean boolean25 = dateTimeZone16.equals((java.lang.Object) 115200000);
        java.util.TimeZone timeZone26 = dateTimeZone16.toTimeZone();
        java.lang.String str28 = dateTimeZone16.getNameKey((long) (byte) 100);
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) str28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int33 = dateTimeZone31.getOffsetFromLocal((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone31, 1L);
        long long38 = dateTimeZone31.nextTransition((long) 187260000);
        int int40 = dateTimeZone31.getOffset(11L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115200000L + "'", long21 == 115200000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 187260000L + "'", long38 == 187260000L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 115200000 + "'", int40 == 115200000);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 10);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) 10);
        long long11 = dateTimeZone2.convertLocalToUTC(115140000L, true, (long) 100);
        java.lang.String str13 = dateTimeZone2.getNameKey((long) 60000);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((-230399900L), locale15);
        boolean boolean17 = dateTimeZone2.isFixed();
        long long20 = dateTimeZone2.convertLocalToUTC((-230399947L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-72120000L) + "'", long11 == (-72120000L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:01" + "'", str16, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-417659947L) + "'", long20 == (-417659947L));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean15 = dateTimeZone1.isFixed();
        long long17 = dateTimeZone1.previousTransition((-115199999L));
        int int19 = dateTimeZone1.getStandardOffset((long) 1);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getName((long) ' ', locale21);
        java.lang.String str23 = dateTimeZone1.toString();
        int int25 = dateTimeZone1.getOffsetFromLocal((-187259947L));
        java.lang.String str27 = dateTimeZone1.getNameKey(233940000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115199999L) + "'", long17 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone11.isLocalDateTimeGap(localDateTime12);
        boolean boolean14 = dateTimeZone8.equals((java.lang.Object) dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone11.isLocalDateTimeGap(localDateTime15);
        long long18 = dateTimeZone11.nextTransition((-230399947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-230399947L) + "'", long18 == (-230399947L));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        long long12 = dateTimeZone1.convertLocalToUTC((-115200000L), false);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((-111659899L), locale15);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-230400000L) + "'", long12 == (-230400000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long19 = dateTimeZone1.convertLocalToUTC((-115199896L), false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getName((-345599896L), locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230399896L) + "'", long19 == (-230399896L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187260000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        java.lang.String str11 = dateTimeZone1.getShortName((-1L));
        java.lang.String str12 = dateTimeZone1.toString();
        java.lang.String str14 = dateTimeZone1.getShortName((-244680000L));
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.String str10 = dateTimeZone1.getID();
        int int12 = dateTimeZone1.getOffsetFromLocal(187199999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, (long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone17.isLocalDateTimeGap(localDateTime21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone17.getShortName(0L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int18 = dateTimeZone16.getOffsetFromLocal((-1L));
        boolean boolean19 = dateTimeZone16.isFixed();
        long long21 = dateTimeZone16.convertUTCToLocal(0L);
        int int23 = dateTimeZone16.getOffset(115200010L);
        boolean boolean25 = dateTimeZone16.equals((java.lang.Object) 115200000);
        java.util.TimeZone timeZone26 = dateTimeZone16.toTimeZone();
        java.lang.String str28 = dateTimeZone16.getNameKey((long) (byte) 100);
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) str28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str33 = dateTimeZone32.toString();
        long long35 = dateTimeZone32.nextTransition((long) (byte) -1);
        int int37 = dateTimeZone32.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone32, 3600000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        java.util.TimeZone timeZone42 = dateTimeZone32.toTimeZone();
        int int44 = dateTimeZone32.getOffsetFromLocal((-115320001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115200000L + "'", long21 == 115200000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60000 + "'", int37 == 60000);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 118740000L + "'", long40 == 118740000L);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60000 + "'", int44 == 60000);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        long long17 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int20 = dateTimeZone1.getOffset((long) '#');
        long long22 = dateTimeZone1.nextTransition((-115200000L));
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getShortName(115140010L, locale24);
        java.lang.String str27 = dateTimeZone1.getNameKey((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115200000L) + "'", long22 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition((-111540000L));
        long long6 = dateTimeZone2.convertUTCToLocal((-115139965L));
        long long10 = dateTimeZone2.convertLocalToUTC((-345480090L), true, (-43679900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-111540000L) + "'", long4 == (-111540000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-114539965L) + "'", long6 == (-114539965L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-346080090L) + "'", long10 == (-346080090L));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean4 = dateTimeZone2.isStandardOffset((-230339900L));
        int int6 = dateTimeZone2.getStandardOffset((-115200000L));
        java.lang.String str8 = dateTimeZone2.getNameKey((-115080011L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        int int8 = dateTimeZone1.getOffset((-115200001L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(187200010L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        int int17 = dateTimeZone1.getOffset(115200100L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone22.getShortName((long) (byte) 10, locale24);
        java.lang.String str26 = dateTimeZone22.getID();
        java.lang.String str27 = dateTimeZone22.getID();
        long long29 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, 100L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone22.getName((long) (byte) -1, locale31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone22.getShortName(60010L, locale34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone37.getShortName((long) (byte) 10, locale39);
        java.lang.String str41 = dateTimeZone37.getID();
        long long43 = dateTimeZone22.getMillisKeepLocal(dateTimeZone37, 115200001L);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone37.getName((-43079900L), locale45);
        boolean boolean47 = dateTimeZone1.equals((java.lang.Object) locale45);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115139900L) + "'", long29 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 115200001L + "'", long43 == 115200001L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.previousTransition((-302459948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-302459948L) + "'", long10 == (-302459948L));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getNameKey(230279910L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int18 = dateTimeZone16.getOffsetFromLocal((-1L));
        boolean boolean19 = dateTimeZone16.isFixed();
        long long21 = dateTimeZone16.convertUTCToLocal(0L);
        int int23 = dateTimeZone16.getOffset(115200010L);
        boolean boolean25 = dateTimeZone16.equals((java.lang.Object) 115200000);
        java.util.TimeZone timeZone26 = dateTimeZone16.toTimeZone();
        java.lang.String str28 = dateTimeZone16.getNameKey((long) (byte) 100);
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) str28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str33 = dateTimeZone32.toString();
        long long35 = dateTimeZone32.nextTransition((long) (byte) -1);
        int int37 = dateTimeZone32.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone32, 3600000L);
        int int42 = dateTimeZone32.getOffsetFromLocal((-115139948L));
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone32.getShortName(115200000L, locale44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone47.getShortName((long) (byte) 10, locale49);
        java.lang.String str51 = dateTimeZone47.getID();
        boolean boolean53 = dateTimeZone47.isStandardOffset(10L);
        int int55 = dateTimeZone47.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone57.getShortName((long) (byte) 10, locale59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        int int62 = dateTimeZone57.getOffset(readableInstant61);
        java.lang.String str64 = dateTimeZone57.getName(1L);
        long long66 = dateTimeZone47.getMillisKeepLocal(dateTimeZone57, (long) (short) 1);
        long long68 = dateTimeZone57.nextTransition(115200000L);
        long long72 = dateTimeZone57.convertLocalToUTC((long) '#', false, (long) (short) 0);
        long long74 = dateTimeZone32.getMillisKeepLocal(dateTimeZone57, (long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115200000L + "'", long21 == 115200000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60000 + "'", int37 == 60000);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 118740000L + "'", long40 == 118740000L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60000 + "'", int42 == 60000);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:01" + "'", str45, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+32:00" + "'", str50, "+32:00");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:00" + "'", str51, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 115200000 + "'", int55 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+32:00" + "'", str60, "+32:00");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 115200000 + "'", int62 == 115200000);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+32:00" + "'", str64, "+32:00");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 115200000L + "'", long68 == 115200000L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-115199965L) + "'", long72 == (-115199965L));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-115139965L) + "'", long74 == (-115139965L));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        boolean boolean13 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.getName(115200032L);
        long long17 = dateTimeZone1.convertUTCToLocal((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200000L + "'", long17 == 115200000L);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        long long10 = dateTimeZone0.previousTransition(115200035L);
        long long13 = dateTimeZone0.adjustOffset((-600000L), true);
        int int15 = dateTimeZone0.getOffsetFromLocal((-229859900L));
        java.lang.String str16 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139990L) + "'", long4 == (-115139990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60001L) + "'", long8 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200035L + "'", long10 == 115200035L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-600000L) + "'", long13 == (-600000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((long) '#');
        java.lang.String str15 = dateTimeZone4.getNameKey((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName((long) (byte) 10, locale23);
        java.lang.String str25 = dateTimeZone21.getID();
        long long27 = dateTimeZone21.convertUTCToLocal((-230339900L));
        long long29 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, 60010L);
        long long31 = dateTimeZone4.getMillisKeepLocal(dateTimeZone18, (long) '#');
        boolean boolean32 = dateTimeZone4.isFixed();
        java.lang.String str33 = dateTimeZone4.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115139900L) + "'", long27 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115079990L) + "'", long29 == (-115079990L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115140035L + "'", long31 == 115140035L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        boolean boolean3 = dateTimeZone2.isFixed();
        long long5 = dateTimeZone2.previousTransition(59975L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 59975L + "'", long5 == 59975L);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        long long5 = dateTimeZone1.previousTransition((long) 60000);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.lang.String str12 = dateTimeZone7.getName(10L);
        long long15 = dateTimeZone7.convertLocalToUTC(0L, true);
        java.lang.String str16 = dateTimeZone7.toString();
        java.lang.String str17 = dateTimeZone7.toString();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone7.getOffset(readableInstant18);
        long long21 = dateTimeZone7.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone23.getShortName((long) (byte) 10, locale25);
        java.lang.String str27 = dateTimeZone23.getID();
        java.lang.String str28 = dateTimeZone23.getID();
        java.lang.String str29 = dateTimeZone23.getID();
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone23.getOffset(readableInstant30);
        int int33 = dateTimeZone23.getStandardOffset(230340010L);
        boolean boolean34 = dateTimeZone7.equals((java.lang.Object) dateTimeZone23);
        boolean boolean36 = dateTimeZone7.isStandardOffset(115200001L);
        boolean boolean37 = dateTimeZone1.equals((java.lang.Object) boolean36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone40.getOffset(readableInstant41);
        long long46 = dateTimeZone40.convertLocalToUTC(43080000L, false, 60010L);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone40.isLocalDateTimeGap(localDateTime47);
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone40.getName((-230219990L), locale50);
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone40.getShortName((-115199900L), locale53);
        boolean boolean55 = dateTimeZone1.equals((java.lang.Object) locale53);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60000L + "'", long5 == 60000L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60000 + "'", int42 == 60000);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 43020000L + "'", long46 == 43020000L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:01" + "'", str51, "+00:01");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:01" + "'", str54, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition((long) 'a');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(52L, locale4);
        long long8 = dateTimeZone0.adjustOffset((long) 'a', false);
        long long10 = dateTimeZone0.previousTransition((long) 1);
        java.lang.String str12 = dateTimeZone0.getName((-115080001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.getID();
        int int5 = dateTimeZone2.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        long long12 = dateTimeZone1.convertUTCToLocal(52L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName(0L, locale17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone21.getOffset(readableInstant22);
        long long25 = dateTimeZone15.getMillisKeepLocal(dateTimeZone21, (long) (byte) 10);
        long long29 = dateTimeZone15.convertLocalToUTC(115200000L, false, 0L);
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone15, (-115139900L));
        long long33 = dateTimeZone15.convertUTCToLocal(115139999L);
        java.lang.String str34 = dateTimeZone15.getID();
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone15.isLocalDateTimeGap(localDateTime35);
        long long39 = dateTimeZone15.convertLocalToUTC((-115199990L), false);
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = dateTimeZone15.getOffset(readableInstant40);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200052L + "'", long12 == 115200052L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115140000L + "'", long29 == 115140000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 115199999L + "'", long33 == 115199999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115259990L) + "'", long39 == (-115259990L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60000 + "'", int41 == 60000);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long4 = dateTimeZone2.convertUTCToLocal((-72120000L));
        java.lang.String str5 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-72060000L) + "'", long4 == (-72060000L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-417659900L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        boolean boolean5 = dateTimeZone1.isStandardOffset((-115200000L));
        long long7 = dateTimeZone1.previousTransition((-229799990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-229799990L) + "'", long7 == (-229799990L));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        long long17 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str19 = dateTimeZone1.getName((-115260000L));
        long long21 = dateTimeZone1.nextTransition((-345659903L));
        java.lang.String str23 = dateTimeZone1.getShortName(52L);
        long long25 = dateTimeZone1.previousTransition((-72120000L));
        long long29 = dateTimeZone1.convertLocalToUTC((-345539903L), false, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-345659903L) + "'", long21 == (-345659903L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-72120000L) + "'", long25 == (-72120000L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-460739903L) + "'", long29 == (-460739903L));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getNameKey((long) (byte) 1);
        boolean boolean13 = dateTimeZone9.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        long long16 = dateTimeZone9.convertUTCToLocal((long) 115200000);
        java.lang.String str17 = dateTimeZone9.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 302460000L + "'", long16 == 302460000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.convertUTCToLocal(115200052L);
        int int5 = dateTimeZone1.getOffset((-230399890L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200087L + "'", long3 == 115200087L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        int int13 = dateTimeZone1.getOffset((long) (byte) 100);
        java.lang.String str14 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        int int18 = dateTimeZone1.getOffsetFromLocal(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getStandardOffset(230340010L);
        java.lang.String str12 = dateTimeZone1.getID();
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str8 = dateTimeZone7.toString();
        long long11 = dateTimeZone7.adjustOffset((long) (byte) -1, true);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.previousTransition((long) (byte) -1);
        long long19 = dateTimeZone13.convertLocalToUTC(115199999L, true, (long) '#');
        long long21 = dateTimeZone13.nextTransition((long) 10);
        int int23 = dateTimeZone13.getOffsetFromLocal((-115199900L));
        long long25 = dateTimeZone7.getMillisKeepLocal(dateTimeZone13, (long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone13.getOffset(readableInstant26);
        long long31 = dateTimeZone13.convertLocalToUTC(51L, true, (-115199949L));
        boolean boolean32 = dateTimeZone2.equals((java.lang.Object) dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115139999L + "'", long19 == 115139999L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-59949L) + "'", long31 == (-59949L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName((-115139948L));
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) nameProvider6);
        long long12 = dateTimeZone1.adjustOffset((-345599896L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-345599896L) + "'", long12 == (-345599896L));
    }
}
